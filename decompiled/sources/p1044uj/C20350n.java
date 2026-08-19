package p1044uj;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mk.C17280a;
import p049Bm.InterfaceC1426a;
import p769gj.C14182x;
import p769gj.InterfaceC14147A;
import p769gj.InterfaceC14161c;
import p911o0.AbstractC17792x;
import p928oh.C18194a;
import p960q9.C18658l;
import pk.C18500e;

/* JADX INFO: renamed from: uj.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C20350n implements InterfaceC14161c, Parcelable {
    public static final Parcelable.Creator<C20350n> CREATOR = new C18658l(16);

    /* JADX INFO: renamed from: Y */
    public final C18500e f64345Y;

    /* JADX INFO: renamed from: Z */
    public final List f64346Z;

    /* JADX INFO: renamed from: o0 */
    public final C17280a f64347o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC1426a f64348p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC1426a f64349q0;

    /* JADX INFO: renamed from: r0 */
    public final C14182x f64350r0;

    public C20350n(C18500e uiScreen, List list, C17280a navigationState, InterfaceC1426a onBack, InterfaceC1426a onCancel) {
        AbstractC16544l.m18094g(uiScreen, "uiScreen");
        AbstractC16544l.m18094g(navigationState, "navigationState");
        AbstractC16544l.m18094g(onBack, "onBack");
        AbstractC16544l.m18094g(onCancel, "onCancel");
        this.f64345Y = uiScreen;
        this.f64346Z = list;
        this.f64347o0 = navigationState;
        this.f64348p0 = onBack;
        this.f64349q0 = onCancel;
        C20348m c20348m = new C20348m(4, 0, C20350n.class, this, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;Lcom/withpersona/sdk2/inquiry/document/DocumentInstructionsView;Lcom/squareup/workflow1/ui/ViewEnvironment;Ljava/util/Map;)V");
        this.f64350r0 = new C14182x(AbstractC16526C.f51263a.mo5693b(C20350n.class), C20344k.f64332Y, new C18194a(uiScreen, 12, c20348m));
    }

    @Override // p769gj.InterfaceC14161c
    /* JADX INFO: renamed from: a */
    public final InterfaceC14147A mo1134a() {
        return this.f64350r0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f64345Y, i10);
        Iterator itM19536s = AbstractC17792x.m19536s(this.f64346Z, out);
        while (itM19536s.hasNext()) {
            out.writeSerializable((Serializable) itM19536s.next());
        }
        out.writeParcelable(this.f64347o0, i10);
        out.writeSerializable((Serializable) this.f64348p0);
        out.writeSerializable((Serializable) this.f64349q0);
    }
}
