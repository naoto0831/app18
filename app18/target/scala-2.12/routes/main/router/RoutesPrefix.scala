// @GENERATOR:play-routes-compiler
// @SOURCE:C:/play/app18/conf/routes
// @DATE:Mon Feb 04 17:50:29 JST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
