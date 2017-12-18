import org.scalatra._
import com.avaya.ept.pipeline.MyScalatraServlet
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new MyScalatraServlet, "/*")
  }
}
