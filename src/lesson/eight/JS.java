package lesson.eight;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by igor on 10.02.2016.
 */
public class JS {
    public static void main(String[] args) throws ScriptException {


        ScriptEngineManager m = new ScriptEngineManager();
        ScriptEngine engine = m.getEngineByName("nashorn");
        engine.eval("print('hello')");

        String code =" var a = 432; print(a);";
        engine.eval(code);

    }
}
