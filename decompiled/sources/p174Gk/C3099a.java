package p174Gk;

import android.content.res.Resources;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16546n;
import p003A1.C0254h0;
import p049Bm.InterfaceC1426a;
import p198Hk.C3460c;
import p198Hk.C3463f;

/* JADX INFO: renamed from: Gk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3099a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C3099a f9325Z = new C3099a(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C3099a f9326o0 = new C3099a(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9327Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3099a(int i10, int i11) {
        super(i10);
        this.f9327Y = i11;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, mm.i] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        Field field;
        switch (this.f9327Y) {
            case 0:
                C3460c c3460c = new C3460c();
                C0254h0 c0254h0 = new C0254h0(c3460c, 24);
                try {
                    Object value = C3463f.f10528b.getValue();
                    if (value != null && (field = (Field) C3463f.f10529c.getValue()) != null) {
                        Object obj = field.get(value);
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<android.view.View> /* = java.util.ArrayList<android.view.View> */");
                        }
                        field.set(value, c0254h0.invoke((ArrayList) obj));
                    }
                } catch (Throwable th2) {
                    AbstractC15256t.m16484v("WindowManagerSpy", th2);
                }
                return c3460c;
            default:
                try {
                    return Resources.getSystem().getString(Resources.getSystem().getIdentifier("tooltip_popup_title", "string", "android"));
                } catch (Resources.NotFoundException unused) {
                    return "Tooltip";
                }
        }
    }
}
