package p986ra;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import p523V9.AbstractC7987S3;
import za.C21826i;
import za.InterfaceC21825h;

/* JADX INFO: renamed from: ra.b */
/* JADX INFO: loaded from: classes.dex */
public final class C18905b extends AbstractC7987S3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60273a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f60274b;

    public /* synthetic */ C18905b(Object obj, int i10) {
        this.f60273a = i10;
        this.f60274b = obj;
    }

    @Override // p523V9.AbstractC7987S3
    /* JADX INFO: renamed from: e */
    public final void mo2475e(int i10) {
        switch (this.f60273a) {
            case 0:
                break;
            default:
                C21826i c21826i = (C21826i) this.f60274b;
                c21826i.f69272d = true;
                InterfaceC21825h interfaceC21825h = (InterfaceC21825h) c21826i.f69273e.get();
                if (interfaceC21825h != null) {
                    C18909f c18909f = (C18909f) interfaceC21825h;
                    c18909f.m20264y();
                    c18909f.invalidateSelf();
                }
                break;
        }
    }

    @Override // p523V9.AbstractC7987S3
    /* JADX INFO: renamed from: f */
    public final void mo2476f(Typeface typeface, boolean z6) {
        switch (this.f60273a) {
            case 0:
                Chip chip = (Chip) this.f60274b;
                C18909f c18909f = chip.f36540s0;
                chip.setText(c18909f.f60299O1 ? c18909f.f60302Q0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z6) {
                    C21826i c21826i = (C21826i) this.f60274b;
                    c21826i.f69272d = true;
                    InterfaceC21825h interfaceC21825h = (InterfaceC21825h) c21826i.f69273e.get();
                    if (interfaceC21825h != null) {
                        C18909f c18909f2 = (C18909f) interfaceC21825h;
                        c18909f2.m20264y();
                        c18909f2.invalidateSelf();
                    }
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m20231g(int i10) {
    }
}
