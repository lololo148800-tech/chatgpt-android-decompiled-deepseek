package p1109xj;

import android.content.Context;
import com.withpersona.sdk2.inquiry.BuildConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC16544l;
import p037B9.MeDP.MpoABj;
import p1113xn.AbstractC21329w;
import p523V9.AbstractC7942M5;
import p544W9.AbstractC8752z3;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: xj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C21277a {

    /* JADX INFO: renamed from: b */
    public static final Charset f67670b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final File f67671a;

    public C21277a(Context context) {
        AbstractC16544l.m18094g(context, "context");
        this.f67671a = new File(new File(context.getFilesDir(), ".com.withpersona.sdk2.inquiry"), "errors");
    }

    /* JADX INFO: renamed from: a */
    public final void m21620a(Throwable error) {
        String str;
        String str2;
        AbstractC16544l.m18094g(error, "error");
        File file = this.f67671a;
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.isDirectory()) {
            file.delete();
            file.mkdirs();
        }
        File file2 = new File(file, "last_error.txt");
        if (file2.isDirectory()) {
            file2.delete();
        }
        String canonicalName = error.getClass().getCanonicalName();
        Throwable cause = error;
        loop0: while (true) {
            str = MpoABj.YKI;
            if (cause == null) {
                str2 = null;
                break;
            }
            StackTraceElement[] stackTrace = cause.getStackTrace();
            AbstractC16544l.m18093f(stackTrace, "getStackTrace(...)");
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                AbstractC16544l.m18093f(className, "getClassName(...)");
                if (AbstractC21329w.m21734u(className, BuildConfig.LIBRARY_PACKAGE_NAME, false)) {
                    str2 = stackTraceElement.getClassName() + " in " + stackTraceElement.getMethodName() + str + stackTraceElement.getLineNumber();
                    break loop0;
                }
            }
            cause = cause.getCause();
        }
        if (str2 == null) {
            StackTraceElement[] stackTrace2 = error.getStackTrace();
            AbstractC16544l.m18093f(stackTrace2, "getStackTrace(...)");
            StackTraceElement stackTraceElement2 = (StackTraceElement) AbstractC17678l.m19317x(stackTrace2);
            str2 = stackTraceElement2 != null ? stackTraceElement2.getClassName() + " in " + stackTraceElement2.getMethodName() + str + stackTraceElement2.getLineNumber() : null;
        }
        String strM9890i = AbstractC9306j0.m9890i(canonicalName, " in ", str2);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(AbstractC8752z3.m9509d(new FileOutputStream(file2), file2), f67670b);
        try {
            outputStreamWriter.write(strM9890i);
            AbstractC7942M5.m8232a(outputStreamWriter, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC7942M5.m8232a(outputStreamWriter, th2);
                throw th3;
            }
        }
    }
}
