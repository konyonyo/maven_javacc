/* Generated By:JJTree: Do not edit this line. ASTHello.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package main.java.parser;

public
class ASTHello extends SimpleNode {
  public ASTHello(int id) {
    super(id);
  }

  public ASTHello(HelloParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HelloParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=8ad7fd25d55a5c8a5c6e84d0de6d8d43 (do not edit this line) */
