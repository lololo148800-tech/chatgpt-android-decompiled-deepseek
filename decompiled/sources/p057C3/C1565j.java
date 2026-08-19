package p057C3;

import ac.C10539a;
import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import ec.C13363e;
import io.sentry.android.core.AbstractC15256t;
import p001A.C0095w0;
import p1016t3.C19757G;
import p1060v9.AbstractC20502t;
import p1073w3.C20813o;
import p139F9.BinderC2679b;
import p165G9.C3016b;
import p165G9.C3020f;
import p401Qb.C6584a;
import p501Ub.AbstractC7606h;
import p523V9.AbstractC7897H0;
import p523V9.AbstractC8199t5;
import p594Y9.AbstractBinderC9823V4;
import p594Y9.AbstractC9986w;
import p594Y9.C9788P4;
import p594Y9.C9811T4;
import p594Y9.C9817U4;
import p594Y9.C9861b5;
import p594Y9.EnumC9966s3;
import p594Y9.EnumC9972t3;
import p594Y9.InterfaceC9829W4;
import p664bc.C11337d;
import p748fc.InterfaceC13613e;
import p768gc.C13836a;

/* JADX INFO: renamed from: C3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1565j implements InterfaceC1536N, InterfaceC13613e {

    /* JADX INFO: renamed from: Y */
    public boolean f4374Y;

    /* JADX INFO: renamed from: Z */
    public boolean f4375Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f4376o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f4377p0;

    /* JADX INFO: renamed from: q0 */
    public Object f4378q0;

    /* JADX INFO: renamed from: r0 */
    public Object f4379r0;

    public C1565j(Context context, C13836a c13836a, C9788P4 c9788p4) {
        this.f4376o0 = context;
        this.f4377p0 = c13836a;
        this.f4378q0 = c9788p4;
    }

    @Override // p748fc.InterfaceC13613e
    /* JADX INFO: renamed from: a */
    public C13363e mo2430a(C10539a c10539a) throws C6584a {
        if (((C9811T4) this.f4379r0) == null) {
            mo2431b();
        }
        C9811T4 c9811t4 = (C9811T4) this.f4379r0;
        AbstractC20502t.m21157h(c9811t4);
        boolean z6 = this.f4374Y;
        C13836a c13836a = (C13836a) this.f4377p0;
        if (!z6) {
            try {
                c9811t4.m6118o(c9811t4.m6116m(), 1);
                this.f4374Y = true;
            } catch (RemoteException e10) {
                throw new C6584a(13, e10, "Failed to init text recognizer ".concat(c13836a.m15475b()));
            }
        }
        int i10 = c10539a.f31260g;
        int i11 = c10539a.f31257d;
        int i12 = c10539a.f31258e;
        int iM8194b = AbstractC7897H0.m8194b(c10539a.f31259f);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        BinderC2679b binderC2679bM12776a = C11337d.m12776a(c10539a);
        try {
            Parcel parcelM6116m = c9811t4.m6116m();
            AbstractC9986w.m10629a(parcelM6116m, binderC2679bM12776a);
            parcelM6116m.writeInt(1);
            int iM8811j = AbstractC8199t5.m8811j(parcelM6116m, 20293);
            AbstractC8199t5.m8813l(parcelM6116m, 1, 4);
            parcelM6116m.writeInt(i10);
            AbstractC8199t5.m8813l(parcelM6116m, 2, 4);
            parcelM6116m.writeInt(i11);
            AbstractC8199t5.m8813l(parcelM6116m, 3, 4);
            parcelM6116m.writeInt(i12);
            AbstractC8199t5.m8813l(parcelM6116m, 4, 4);
            parcelM6116m.writeInt(iM8194b);
            AbstractC8199t5.m8813l(parcelM6116m, 5, 8);
            parcelM6116m.writeLong(jElapsedRealtime);
            AbstractC8199t5.m8812k(parcelM6116m, iM8811j);
            Parcel parcelM6117n = c9811t4.m6117n(parcelM6116m, 3);
            C9861b5 c9861b5CreateFromParcel = parcelM6117n.readInt() == 0 ? null : C9861b5.CREATOR.createFromParcel(parcelM6117n);
            parcelM6117n.recycle();
            return new C13363e(c9861b5CreateFromParcel);
        } catch (RemoteException e11) {
            throw new C6584a(13, e11, "Failed to run text recognizer ".concat(c13836a.m15475b()));
        }
    }

    @Override // p748fc.InterfaceC13613e
    /* JADX INFO: renamed from: b */
    public void mo2431b() throws C6584a {
        InterfaceC9829W4 c9817u4;
        int i10 = 5;
        EnumC9972t3 enumC9972t3 = EnumC9972t3.ON_DEVICE_TEXT_LOAD;
        C9788P4 c9788p4 = (C9788P4) this.f4378q0;
        Context context = (Context) this.f4376o0;
        C13836a c13836a = (C13836a) this.f4377p0;
        if (((C9811T4) this.f4379r0) == null) {
            try {
                IBinder iBinderM3872b = C3020f.m3866c(context, c13836a.m15474a() ? C3020f.f9096c : C3020f.f9095b, true != c13836a.m15474a() ? "com.google.android.gms.vision.ocr" : "com.google.mlkit.dynamite.text.latin").m3872b(true != c13836a.m15474a() ? "com.google.android.gms.vision.text.mlkit.TextRecognizerCreator" : "com.google.mlkit.vision.text.bundled.latin.BundledLatinTextRecognizerCreator");
                int i11 = AbstractBinderC9823V4.f29331b;
                if (iBinderM3872b == null) {
                    c9817u4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderM3872b.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
                    c9817u4 = iInterfaceQueryLocalInterface instanceof InterfaceC9829W4 ? (InterfaceC9829W4) iInterfaceQueryLocalInterface : new C9817U4(iBinderM3872b, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator", 5);
                }
                this.f4379r0 = ((C9817U4) c9817u4).m10456s(new BinderC2679b(context));
                c9788p4.m10404b(new C0095w0(c13836a.m15474a(), EnumC9966s3.NO_ERROR, i10), enumC9972t3);
            } catch (C3016b e10) {
                c9788p4.m10404b(new C0095w0(c13836a.m15474a(), EnumC9966s3.OPTIONAL_MODULE_NOT_AVAILABLE, i10), enumC9972t3);
                if (c13836a.m15474a()) {
                    throw new C6584a(13, e10, AbstractC10763a.m11055m("Failed to load text module ", c13836a.m15475b(), ". ", e10.getMessage()));
                }
                if (!this.f4375Z) {
                    AbstractC7606h.m7953a(context, "ocr");
                    this.f4375Z = true;
                }
                throw new C6584a("Waiting for the text optional module to be downloaded. Please wait.", 14);
            } catch (RemoteException e11) {
                c9788p4.m10404b(new C0095w0(c13836a.m15474a(), EnumC9966s3.OPTIONAL_MODULE_INIT_ERROR, i10), enumC9972t3);
                throw new C6584a(13, e11, "Failed to create text recognizer ".concat(c13836a.m15475b()));
            }
        }
    }

    @Override // p748fc.InterfaceC13613e
    /* JADX INFO: renamed from: c */
    public void mo2432c() {
        C9811T4 c9811t4 = (C9811T4) this.f4379r0;
        if (c9811t4 != null) {
            try {
                c9811t4.m6118o(c9811t4.m6116m(), 2);
            } catch (RemoteException e10) {
                AbstractC15256t.m16466d("DecoupledTextDelegate", "Failed to release text recognizer ".concat(((C13836a) this.f4377p0).m15475b()), e10);
            }
            this.f4379r0 = null;
        }
        this.f4374Y = false;
    }

    @Override // p057C3.InterfaceC1536N
    /* JADX INFO: renamed from: d */
    public void mo2329d(C19757G c19757g) {
        InterfaceC1536N interfaceC1536N = (InterfaceC1536N) this.f4379r0;
        if (interfaceC1536N != null) {
            interfaceC1536N.mo2329d(c19757g);
            c19757g = ((InterfaceC1536N) this.f4379r0).mo2332g();
        }
        ((C1563h0) this.f4376o0).mo2329d(c19757g);
    }

    @Override // p057C3.InterfaceC1536N
    /* JADX INFO: renamed from: e */
    public long mo2330e() {
        if (this.f4374Y) {
            return ((C1563h0) this.f4376o0).mo2330e();
        }
        InterfaceC1536N interfaceC1536N = (InterfaceC1536N) this.f4379r0;
        interfaceC1536N.getClass();
        return interfaceC1536N.mo2330e();
    }

    @Override // p057C3.InterfaceC1536N
    /* JADX INFO: renamed from: f */
    public boolean mo2331f() {
        if (this.f4374Y) {
            ((C1563h0) this.f4376o0).getClass();
            return false;
        }
        InterfaceC1536N interfaceC1536N = (InterfaceC1536N) this.f4379r0;
        interfaceC1536N.getClass();
        return interfaceC1536N.mo2331f();
    }

    @Override // p057C3.InterfaceC1536N
    /* JADX INFO: renamed from: g */
    public C19757G mo2332g() {
        InterfaceC1536N interfaceC1536N = (InterfaceC1536N) this.f4379r0;
        return interfaceC1536N != null ? interfaceC1536N.mo2332g() : (C19757G) ((C1563h0) this.f4376o0).f4364q0;
    }

    public C1565j(C1532J c1532j, C20813o c20813o) {
        this.f4377p0 = c1532j;
        this.f4376o0 = new C1563h0(c20813o);
        this.f4374Y = true;
    }
}
