package sg;

import android.content.Context;
import android.content.Intent;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p553Wh.C8870f;
import p571X9.AbstractC9209T;
import p893n.AbstractActivityC17375g;

/* JADX INFO: renamed from: sg.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C19547K extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f62093Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f62094Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8870f f62095o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Context f62096p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractActivityC17375g f62097q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19547K(InterfaceC1426a interfaceC1426a, C8870f c8870f, Context context, AbstractActivityC17375g abstractActivityC17375g, int i10) {
        super(1);
        this.f62093Y = i10;
        this.f62094Z = interfaceC1426a;
        this.f62095o0 = c8870f;
        this.f62096p0 = context;
        this.f62097q0 = abstractActivityC17375g;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f62093Y) {
            case 0:
                InterfaceC19572n effect = (InterfaceC19572n) obj;
                AbstractC16544l.m18094g(effect, "effect");
                boolean zEquals = effect.equals(C19570l.f62159a);
                InterfaceC1426a interfaceC1426a = this.f62094Z;
                if (zEquals) {
                    interfaceC1426a.invoke();
                } else if (effect instanceof C19571m) {
                    String string = this.f62096p0.getString(R.string.report_content_submit_successful_text);
                    AbstractC16544l.m18093f(string, "getString(...)");
                    C8870f c8870f = this.f62095o0;
                    C8870f.m9548c(c8870f, string, null, 14);
                    Intent intent = ((C19571m) effect).f62160a;
                    if (intent != null) {
                        AbstractC9209T.m9776b(this.f62097q0, c8870f, intent);
                    }
                    interfaceC1426a.invoke();
                }
                break;
            default:
                InterfaceC19572n effect2 = (InterfaceC19572n) obj;
                AbstractC16544l.m18094g(effect2, "effect");
                boolean zEquals2 = effect2.equals(C19570l.f62159a);
                InterfaceC1426a interfaceC1426a2 = this.f62094Z;
                if (zEquals2) {
                    interfaceC1426a2.invoke();
                } else if (effect2 instanceof C19571m) {
                    String string2 = this.f62096p0.getString(R.string.report_content_submit_successful_text);
                    AbstractC16544l.m18093f(string2, "getString(...)");
                    C8870f c8870f2 = this.f62095o0;
                    C8870f.m9548c(c8870f2, string2, null, 14);
                    Intent intent2 = ((C19571m) effect2).f62160a;
                    if (intent2 != null) {
                        AbstractC9209T.m9776b(this.f62097q0, c8870f2, intent2);
                    }
                    interfaceC1426a2.invoke();
                }
                break;
        }
        return C17296C.f55119a;
    }
}
