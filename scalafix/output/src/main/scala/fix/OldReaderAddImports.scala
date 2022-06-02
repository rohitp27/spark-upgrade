import org.apache.spark._
import org.apache.spark.rdd._
import org.apache.spark.sql.{SparkSession, Dataset}
import org.apache.spark.sql.Encoders

object BadReadsAddImports {
  def doMyWork(session: SparkSession, r: RDD[String], dataset: Dataset[String]) = {
    import session.implicits._
    val shouldRewriteBasic = session.read.json(session.createDataset(r)(Encoders.STRING))
    val r2 = session.sparkContext.parallelize(List("{}"))
    val shouldRewrite = session.read.json(session.createDataset(r2)(Encoders.STRING))
    val r3: RDD[String] = session.sparkContext.parallelize(List("{}"))
    val shouldRewriteExplicit = session.read.json(session.createDataset(r3)(Encoders.STRING))
    val noRewrite2 = session.read.json(dataset)
  }
}
