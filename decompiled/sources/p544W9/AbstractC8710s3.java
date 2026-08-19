package p544W9;

import android.view.View;
import android.view.Window;
import io.sentry.android.replay.AbstractC15318x;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: W9.s3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8710s3 {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, mm.i] */
    /* JADX INFO: renamed from: b */
    public static final Window m9416b(View view) {
        Field field;
        AbstractC16544l.m18094g(view, "<this>");
        Object obj = AbstractC15318x.f47859a;
        View rootView = view.getRootView();
        AbstractC16544l.m18093f(rootView, "rootView");
        Class cls = (Class) AbstractC15318x.f47859a.getValue();
        if (cls == null || !cls.isInstance(rootView) || (field = (Field) AbstractC15318x.f47860b.getValue()) == null) {
            return null;
        }
        Object obj2 = field.get(rootView);
        AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj2;
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo5751a();
}
