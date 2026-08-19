package fo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17316s;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: fo.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C13716m extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f43270Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13718o f43271Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13716m(C13718o c13718o, int i10) {
        super(0);
        this.f43270Y = i10;
        this.f43271Z = c13718o;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() throws IllegalAccessException, NoSuchFieldException, InvocationTargetException {
        switch (this.f43270Y) {
            case 0:
                Object objInvoke = ((Class) this.f43271Z.f43275b.getValue()).getDeclaredMethod("currentActivityThread", null).invoke(null, null);
                if (objInvoke != null) {
                    return objInvoke;
                }
                AbstractC16544l.m18101n();
                throw null;
            default:
                C13718o c13718o = this.f43271Z;
                Field declaredField = ((Class) c13718o.f43275b.getValue()).getDeclaredField("mServices");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(c13718o.f43276c.getValue());
                if (obj != null) {
                    return (Map) obj;
                }
                throw new C17316s("null cannot be cast to non-null type kotlin.collections.Map<android.os.IBinder, android.app.Service>");
        }
    }
}
