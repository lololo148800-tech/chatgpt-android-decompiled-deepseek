package p003A1;

import androidx.compose.p650ui.platform.AndroidComposeView;
import java.lang.reflect.Method;
import p328N1.InterfaceC5597m;
import p972qm.InterfaceC18775h;

/* JADX INFO: renamed from: A1.X0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0219X0 implements InterfaceC18775h, InterfaceC5597m {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ C0219X0 f847Y = new C0219X0();

    /* JADX INFO: renamed from: Z */
    public static final C0188M1 f848Z = new C0188M1();

    /* JADX INFO: renamed from: a */
    public static final boolean m688a() {
        Class cls = AndroidComposeView.f32748K1;
        try {
            if (AndroidComposeView.f32748K1 == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                AndroidComposeView.f32748K1 = cls2;
                AndroidComposeView.f32749L1 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = AndroidComposeView.f32749L1;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
