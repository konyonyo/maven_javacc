package main.java.hello;

import main.java.parser.*;

public class Hello implements HelloParserVisitor{
    public static void main(String[] args){
        try {
            HelloParser parser = new HelloParser(System.in);
            Node node = parser.Hello();
            Hello visitor = new Hello();
            node.jjtAccept(visitor, null);
        } catch(TokenMgrError ex){
            System.out.println("字句解析エラー:" + ex.getMessage());
        } catch (ParseException ex) {
            System.out.println("構文解析エラー:" + ex.getMessage());
        }
    }

    public Object visit(SimpleNode node, Object data) {
        //ここには来ない
        return null;
    }

    public Object visit(ASTHello node, Object data) {
        String word = node.jjtGetChild(0).jjtAccept(this, null)
                          .toString();
        System.out.println("こんにちは " + word +"!!");
        return null;
    }

    public Object visit(ASTJavaCC node, Object data) {
        return "ステキJavaCC";
    }

    public Object visit(ASTJJTree node, Object data) {
        return "イカスJJTree";
    }
}

