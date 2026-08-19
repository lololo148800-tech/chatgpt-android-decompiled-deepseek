package p001A;

import java.util.List;
import p025An.C0644w;
import p057C3.C1567l;
import p083D3.C1868f;
import p083D3.C1873k;
import p1016t3.InterfaceC19759I;
import p1050v.InterfaceC20412a;
import p1073w3.C20813o;
import p1073w3.InterfaceC20806h;
import p644ab.InterfaceC10532e;

/* JADX INFO: renamed from: A.P */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0030P implements InterfaceC20412a, InterfaceC10532e, InterfaceC20806h {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f151Y;

    public /* synthetic */ C0030P(int i10) {
        this.f151Y = i10;
    }

    @Override // p1050v.InterfaceC20412a, p644ab.InterfaceC10532e
    /* JADX INFO: renamed from: apply */
    public Object mo22421apply(Object obj) {
        switch (this.f151Y) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return null;
            case 2:
            case 4:
            default:
                return new C1868f((C20813o) obj);
            case 3:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
            case 5:
                int i10 = C0057d0.f265g;
                return Boolean.FALSE;
            case 6:
                int i11 = C0061f0.f274h;
                return Boolean.FALSE;
        }
    }

    @Override // p1073w3.InterfaceC20806h
    public void invoke(Object obj) {
        switch (this.f151Y) {
            case 12:
                ((InterfaceC19759I) obj).mo2761i(new C1567l(2, 1003, new C0644w("Player release timed out.")));
                break;
            case 13:
                ((InterfaceC19759I) obj).getClass();
                break;
            case 14:
                ((C1873k) obj).getClass();
                break;
            case 15:
                ((C1873k) obj).getClass();
                break;
            case 16:
                ((C1873k) obj).getClass();
                break;
            case 17:
                ((C1873k) obj).getClass();
                break;
            case 18:
                ((C1873k) obj).getClass();
                break;
            case 19:
                ((C1873k) obj).getClass();
                break;
            case 20:
                ((C1873k) obj).getClass();
                break;
            case 21:
                ((C1873k) obj).getClass();
                break;
            case 22:
                ((C1873k) obj).getClass();
                break;
            case 23:
                ((C1873k) obj).getClass();
                break;
            case 24:
                ((C1873k) obj).getClass();
                break;
            case 25:
                ((C1873k) obj).getClass();
                break;
            case 26:
                ((C1873k) obj).getClass();
                break;
            case 27:
                ((C1873k) obj).getClass();
                break;
            case 28:
                ((C1873k) obj).getClass();
                break;
            default:
                ((C1873k) obj).getClass();
                break;
        }
    }
}
