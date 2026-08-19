package p619Zb;

import ac.C10539a;
import android.content.Context;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import p011A9.C0417h;
import p1009s9.C19501d;
import p1009s9.C19503f;
import p1022t9.C19820e;
import p1022t9.InterfaceC19817b;
import p1060v9.AbstractC20502t;
import p1147z9.C21815a;
import p139F9.BinderC2679b;
import p165G9.C3016b;
import p165G9.C3020f;
import p165G9.InterfaceC3019e;
import p401Qb.C6584a;
import p501Ub.AbstractC7606h;
import p501Ub.C7600b;
import p501Ub.C7615q;
import p523V9.AbstractBinderC7990S6;
import p523V9.AbstractC7840A;
import p523V9.AbstractC7854B5;
import p523V9.AbstractC7864D;
import p523V9.AbstractC7897H0;
import p523V9.AbstractC8199t5;
import p523V9.C7848B;
import p523V9.C7896H;
import p523V9.C7967P6;
import p523V9.C7975Q6;
import p523V9.C7982R6;
import p523V9.C8232x6;
import p523V9.EnumC7901H4;
import p523V9.InterfaceC7998T6;
import p546Wb.C8756b;
import p573Xb.C9430a;
import p604Yk.C10077b;
import p664bc.C11337d;
import p746fa.AbstractC13600i;
import p746fa.C13606o;

/* JADX INFO: renamed from: Zb.h */
/* JADX INFO: loaded from: classes.dex */
public final class C10275h implements InterfaceC10274g {

    /* JADX INFO: renamed from: h */
    public static final C7896H f30517h = AbstractC7864D.m8142q("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* JADX INFO: renamed from: a */
    public boolean f30518a;

    /* JADX INFO: renamed from: b */
    public boolean f30519b;

    /* JADX INFO: renamed from: c */
    public boolean f30520c;

    /* JADX INFO: renamed from: d */
    public final Context f30521d;

    /* JADX INFO: renamed from: e */
    public final C8756b f30522e;

    /* JADX INFO: renamed from: f */
    public final C8232x6 f30523f;

    /* JADX INFO: renamed from: g */
    public C7975Q6 f30524g;

    public C10275h(Context context, C8756b c8756b, C8232x6 c8232x6) {
        this.f30521d = context;
        this.f30522e = c8756b;
        this.f30523f = c8232x6;
    }

    @Override // p619Zb.InterfaceC10274g
    /* JADX INFO: renamed from: a */
    public final ArrayList mo950a(C10539a c10539a) throws Throwable {
        if (this.f30524g == null) {
            mo952c();
        }
        C7975Q6 c7975q6 = this.f30524g;
        AbstractC20502t.m21157h(c7975q6);
        if (!this.f30518a) {
            try {
                c7975q6.m6118o(c7975q6.m6116m(), 1);
                this.f30518a = true;
            } catch (RemoteException e10) {
                throw new C6584a(13, e10, "Failed to init barcode scanner.");
            }
        }
        int rowStride = c10539a.f31257d;
        int i10 = c10539a.f31260g;
        if (i10 == 35) {
            Image.Plane[] planeArrM10980a = c10539a.m10980a();
            AbstractC20502t.m21157h(planeArrM10980a);
            rowStride = planeArrM10980a[0].getRowStride();
        }
        int i11 = c10539a.f31258e;
        int iM8194b = AbstractC7897H0.m8194b(c10539a.f31259f);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        BinderC2679b binderC2679bM12776a = C11337d.m12776a(c10539a);
        try {
            Parcel parcelM6116m = c7975q6.m6116m();
            AbstractC7840A.m8088a(parcelM6116m, binderC2679bM12776a);
            parcelM6116m.writeInt(1);
            int iM8811j = AbstractC8199t5.m8811j(parcelM6116m, 20293);
            AbstractC8199t5.m8813l(parcelM6116m, 1, 4);
            parcelM6116m.writeInt(i10);
            AbstractC8199t5.m8813l(parcelM6116m, 2, 4);
            parcelM6116m.writeInt(rowStride);
            AbstractC8199t5.m8813l(parcelM6116m, 3, 4);
            parcelM6116m.writeInt(i11);
            AbstractC8199t5.m8813l(parcelM6116m, 4, 4);
            parcelM6116m.writeInt(iM8194b);
            AbstractC8199t5.m8813l(parcelM6116m, 5, 8);
            parcelM6116m.writeLong(jElapsedRealtime);
            AbstractC8199t5.m8812k(parcelM6116m, iM8811j);
            Parcel parcelM6117n = c7975q6.m6117n(parcelM6116m, 3);
            ArrayList arrayListCreateTypedArrayList = parcelM6117n.createTypedArrayList(C7967P6.CREATOR);
            parcelM6117n.recycle();
            ArrayList arrayList = new ArrayList();
            Iterator it = arrayListCreateTypedArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(new C9430a(new C10077b((C7967P6) it.next(), 1)));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new C6584a(13, e11, "Failed to run barcode scanner.");
        }
    }

    @Override // p619Zb.InterfaceC10274g
    /* JADX INFO: renamed from: b */
    public final void mo951b() {
        C7975Q6 c7975q6 = this.f30524g;
        if (c7975q6 != null) {
            try {
                c7975q6.m6118o(c7975q6.m6116m(), 2);
            } catch (RemoteException e10) {
                AbstractC15256t.m16466d("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e10);
            }
            this.f30524g = null;
            this.f30518a = false;
        }
    }

    @Override // p619Zb.InterfaceC10274g
    /* JADX INFO: renamed from: c */
    public final boolean mo952c() throws Throwable {
        boolean z6 = false;
        if (this.f30524g != null) {
            return this.f30519b;
        }
        Context context = this.f30521d;
        boolean z10 = C3020f.m3865a(context, "com.google.mlkit.dynamite.barcode") > 0;
        C8232x6 c8232x6 = this.f30523f;
        if (z10) {
            this.f30519b = true;
            try {
                this.f30524g = m10870d(C3020f.f9096c, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (C3016b e10) {
                throw new C6584a(13, e10, "Failed to load the bundled barcode module.");
            } catch (RemoteException e11) {
                throw new C6584a(13, e11, "Failed to create thick barcode scanner.");
            }
        } else {
            this.f30519b = false;
            C19501d[] c19501dArr = AbstractC7606h.f24045a;
            C19503f.f61952b.getClass();
            int iM20600a = C19503f.m20600a(context);
            C7896H c7896h = f30517h;
            if (iM20600a >= 221500000) {
                try {
                    C13606o c13606oM1029c = new C0417h(context, null, C0417h.f1374k, InterfaceC19817b.f62869l0, C19820e.f62871c).m1029c(new C7615q(AbstractC7606h.m7955c(AbstractC7606h.f24050f, c7896h), 0));
                    C7600b c7600b = C7600b.f24031Z;
                    c13606oM1029c.getClass();
                    c13606oM1029c.m15125d(AbstractC13600i.f42962a, c7600b);
                    z6 = ((C21815a) AbstractC7854B5.m8113a(c13606oM1029c)).f69186Y;
                } catch (InterruptedException | ExecutionException e12) {
                    AbstractC15256t.m16466d("OptionalModuleUtils", "Failed to complete the task of features availability check", e12);
                }
            } else {
                try {
                    C7848B c7848bListIterator = c7896h.listIterator(0);
                    while (c7848bListIterator.hasNext()) {
                        C3020f.m3866c(context, C3020f.f9095b, (String) c7848bListIterator.next());
                    }
                    z6 = true;
                } catch (C3016b unused) {
                }
            }
            if (!z6) {
                if (!this.f30520c) {
                    AbstractC7606h.m7954b(context, AbstractC7864D.m8142q("barcode", "tflite_dynamite"));
                    this.f30520c = true;
                }
                AbstractC10269b.m10867b(c8232x6, EnumC7901H4.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new C6584a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f30524g = m10870d(C3020f.f9095b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (C3016b | RemoteException e13) {
                AbstractC10269b.m10867b(c8232x6, EnumC7901H4.f24850q0);
                throw new C6584a(13, e13, "Failed to create thin barcode scanner.");
            }
        }
        AbstractC10269b.m10867b(c8232x6, EnumC7901H4.NO_ERROR);
        return this.f30519b;
    }

    /* JADX INFO: renamed from: d */
    public final C7975Q6 m10870d(InterfaceC3019e interfaceC3019e, String str, String str2) {
        IInterface c7982r6;
        Context context = this.f30521d;
        IBinder iBinderM3872b = C3020f.m3866c(context, interfaceC3019e, str).m3872b(str2);
        int i10 = AbstractBinderC7990S6.f25268b;
        C7975Q6 c7975q6 = null;
        if (iBinderM3872b == null) {
            c7982r6 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinderM3872b.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
            c7982r6 = iInterfaceQueryLocalInterface instanceof InterfaceC7998T6 ? (InterfaceC7998T6) iInterfaceQueryLocalInterface : new C7982R6(iBinderM3872b, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator", 3);
        }
        BinderC2679b binderC2679b = new BinderC2679b(context);
        int i11 = this.f30522e.f26676a;
        C7982R6 c7982r7 = (C7982R6) c7982r6;
        Parcel parcelM6116m = c7982r7.m6116m();
        AbstractC7840A.m8088a(parcelM6116m, binderC2679b);
        parcelM6116m.writeInt(1);
        int iM8811j = AbstractC8199t5.m8811j(parcelM6116m, 20293);
        AbstractC8199t5.m8813l(parcelM6116m, 1, 4);
        parcelM6116m.writeInt(i11);
        AbstractC8199t5.m8813l(parcelM6116m, 2, 4);
        parcelM6116m.writeInt(0);
        AbstractC8199t5.m8812k(parcelM6116m, iM8811j);
        Parcel parcelM6117n = c7982r7.m6117n(parcelM6116m, 1);
        IBinder strongBinder = parcelM6117n.readStrongBinder();
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            c7975q6 = iInterfaceQueryLocalInterface2 instanceof C7975Q6 ? (C7975Q6) iInterfaceQueryLocalInterface2 : new C7975Q6(strongBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner", 3);
        }
        parcelM6117n.recycle();
        return c7975q6;
    }
}
