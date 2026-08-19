package p571X9;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC16544l;
import p1046um.AbstractC20391a;
import p1067vm.AbstractC20643a;

/* JADX INFO: renamed from: X9.V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9221V {
    /* JADX INFO: renamed from: a */
    public static void m9789a(Throwable th2, Throwable exception) {
        AbstractC16544l.m18094g(th2, "<this>");
        AbstractC16544l.m18094g(exception, "exception");
        if (th2 != exception) {
            Integer num = AbstractC20643a.f65519a;
            if (num == null || num.intValue() >= 19) {
                th2.addSuppressed(exception);
                return;
            }
            Method method = AbstractC20391a.f64489a;
            if (method != null) {
                method.invoke(th2, exception);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m9790b(Throwable th2) {
        AbstractC16544l.m18094g(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }
}
