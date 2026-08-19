package p021Aj;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputAddressComponent;
import kotlin.jvm.internal.AbstractC16544l;
import p046Bk.C1338M;
import p103Dn.C2153Q0;
import p1044uj.C20305G;
import p1044uj.C20323Z;
import p1156zj.C22166j1;
import p1156zj.C22170l;
import p239Ja.C4301d;
import p239Ja.C4309l;
import p239Ja.C4320w;
import p408Qj.C6739e;
import p647ak.C10654L0;
import p926of.yRae.sVDIzpC;
import uk.C20376f;

/* JADX INFO: renamed from: Aj.n */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0529n implements View.OnClickListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1691Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f1692Z;

    public /* synthetic */ ViewOnClickListenerC0529n(Object obj, int i10) {
        this.f1691Y = i10;
        this.f1692Z = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1691Y) {
            case 0:
                C0532q this$0 = (C0532q) this.f1692Z;
                AbstractC16544l.m18094g(this$0, "this$0");
                this$0.f1700q0.invoke();
                break;
            case 1:
                C22166j1 rendering = (C22166j1) this.f1692Z;
                AbstractC16544l.m18094g(rendering, "$rendering");
                rendering.f70127m.invoke();
                break;
            case 2:
                C1338M this$1 = (C1338M) this.f1692Z;
                AbstractC16544l.m18094g(this$1, "this$0");
                this$1.m2029a().f4923f.m14584c();
                break;
            case 3:
                C4301d c4301d = (C4301d) this.f1692Z;
                EditText editText = c4301d.f13984i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    c4301d.m5122q();
                    break;
                }
                break;
            case 4:
                ((C4309l) this.f1692Z).m5066u();
                break;
            case 5:
                C4320w c4320w = (C4320w) this.f1692Z;
                EditText editText2 = c4320w.f14086f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = c4320w.f14086f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        c4320w.f14086f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        c4320w.f14086f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        c4320w.f14086f.setSelection(selectionEnd);
                    }
                    c4320w.m5122q();
                    break;
                }
                break;
            case 6:
                C6739e c6739e = (C6739e) this.f1692Z;
                AbstractC16544l.m18094g(c6739e, sVDIzpC.aMyfZ);
                c6739e.f21634Z.invoke();
                break;
            case 7:
                C10654L0 rendering2 = (C10654L0) this.f1692Z;
                AbstractC16544l.m18094g(rendering2, "$rendering");
                rendering2.f31634i.invoke();
                break;
            case 8:
                InputAddressComponent inputAddressComponent = (InputAddressComponent) this.f1692Z;
                Boolean bool = Boolean.FALSE;
                inputAddressComponent.f40937w0 = bool;
                C2153Q0 c2153q0 = (C2153Q0) inputAddressComponent.f40939y0.f68344Z;
                c2153q0.getClass();
                c2153q0.m3251l(null, bool);
                break;
            case 9:
                C20376f this_apply = (C20376f) this.f1692Z;
                AbstractC16544l.m18094g(this_apply, "$this_apply");
                this_apply.f64436b.toggle();
                break;
            case 10:
                C20323Z rendering3 = (C20323Z) this.f1692Z;
                AbstractC16544l.m18094g(rendering3, "$rendering");
                rendering3.f64250n.invoke();
                break;
            case 11:
                C20305G this$2 = (C20305G) this.f1692Z;
                AbstractC16544l.m18094g(this$2, "this$0");
                this$2.f64188e.invoke();
                break;
            default:
                C22170l this$3 = (C22170l) this.f1692Z;
                AbstractC16544l.m18094g(this$3, "this$0");
                this$3.f70152b.mo220n();
                break;
        }
    }
}
