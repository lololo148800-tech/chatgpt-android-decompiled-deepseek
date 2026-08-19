package p005A3;

import ac.C10539a;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.compose.foundation.lazy.layout.C10846a;
import androidx.compose.p650ui.platform.AndroidComposeView;
import com.google.protobuf.AbstractC12107L1;
import fo.C13711h;
import io.sentry.android.core.AbstractC15256t;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mo.C17326C;
import mo.C17327D;
import mo.C17328E;
import p001A.C0017I0;
import p001A.C0093v0;
import p003A1.AbstractC0168G;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p026Ao.AbstractC0668b;
import p026Ao.C0656E;
import p026Ao.C0657F;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p049Bm.InterfaceC1426a;
import p060C6.AbstractC1604a;
import p084D4.C1918i;
import p1006s6.C19451a;
import p1014t1.AbstractC19736m;
import p1014t1.C19728e;
import p1014t1.C19738o;
import p1019t6.C19802a;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p1060v9.AbstractC20502t;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20799a;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1140z1.C21658D;
import p1140z1.C21660F;
import p1140z1.C21713r;
import p139F9.BinderC2679b;
import p162G6.InterfaceC3004a;
import p165G9.C3016b;
import p165G9.C3020f;
import p185H6.C3252h;
import p185H6.InterfaceC3247c;
import p185H6.InterfaceC3250f;
import p203I0.AbstractC3564u;
import p203I0.C3540A;
import p203I0.C3541B;
import p203I0.C3551h;
import p225Im.AbstractC3751J;
import p265Kb.C4613f;
import p310M9.C5311e;
import p349O0.C5996c0;
import p392Q0.C6546d;
import p401Qb.C6584a;
import p501Ub.AbstractC7606h;
import p523V9.AbstractBinderC8073e;
import p523V9.AbstractC7840A;
import p523V9.AbstractC7897H0;
import p523V9.AbstractC7972Q3;
import p523V9.C8026X5;
import p523V9.C8049b;
import p523V9.C8057c;
import p523V9.C8065d;
import p523V9.C8089g;
import p523V9.C8232x6;
import p523V9.EnumC7901H4;
import p523V9.InterfaceC8081f;
import p571X9.AbstractC9388w4;
import p571X9.AbstractC9406z4;
import p573Xb.C9430a;
import p582Xk.HXHG.bQBnquXS;
import p588Y2.C9642z;
import p604Yk.C10077b;
import p619Zb.AbstractC10269b;
import p619Zb.InterfaceC10274g;
import p658b5.C11232c;
import p692d0.C12977p;
import p758g0.AbstractC13725A;
import p758g0.AbstractC13758e;
import p758g0.C13756d;
import p758g0.C13781p0;
import p759g1.C13800b;
import p759g1.C13803e;
import p774h1.C14365u;
import p791hj.C14522e;
import p821j1.C16042g;
import p894n0.C17395a;
import p894n0.C17396b;
import p894n0.C17397c;
import p894n0.C17398d;
import p894n0.C17399e;
import p894n0.C17402h;
import p894n0.C17403i;
import p894n0.InterfaceC17405k;
import p909nm.AbstractC17680n;
import p909nm.C17690x;
import p917o6.C17849b;
import p917o6.C17852e;
import p917o6.C17853f;
import p917o6.C17867t;
import p917o6.C17870w;
import p917o6.InterfaceC17833A;
import p917o6.InterfaceC17835C;
import p917o6.InterfaceC17842J;
import p942p6.C18299c;
import p942p6.C18302f;
import p942p6.EnumC18300d;
import p942p6.InterfaceC18298b;
import p953q0.C18558P;
import p953q0.C18561T;
import p953q0.InterfaceC18559Q;
import p953q0.InterfaceC18560S;
import p974qo.C18787c;
import p974qo.C18788d;
import p974qo.C18792h;
import p974qo.C18794j;
import p974qo.C18795k;
import p977r0.C18834f;
import p977r0.C18839k;
import p977r0.C18845q;
import p977r0.C18848t;
import ro.InterfaceC19259c;
import sk.C19662a;
import to.C20010a;
import to.C20035z;

/* JADX INFO: renamed from: A3.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0326m implements InterfaceC0327n, InterfaceC3004a, InterfaceC10274g, InterfaceC18560S {

    /* JADX INFO: renamed from: a */
    public boolean f1139a;

    /* JADX INFO: renamed from: b */
    public Object f1140b;

    /* JADX INFO: renamed from: c */
    public Object f1141c = AbstractC13758e.m15236a(0.0f);

    /* JADX INFO: renamed from: d */
    public Object f1142d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public Object f1143e;

    /* JADX WARN: Multi-variable type inference failed */
    public C0326m(boolean z6, InterfaceC1426a interfaceC1426a) {
        this.f1139a = z6;
        this.f1140b = (AbstractC16546n) interfaceC1426a;
    }

    /* JADX INFO: renamed from: o */
    public static C17853f m947o(InterfaceC17842J interfaceC17842J, AbstractC1604a abstractC1604a) {
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC16544l.m18093f(uuidRandomUUID, "randomUUID(...)");
        return new C17853f(uuidRandomUUID, interfaceC17842J, null, null, abstractC1604a, C17690x.f56481Y, C17870w.f56967a, true);
    }

    /* JADX INFO: renamed from: r */
    public static int m948r(C0324k c0324k, int i10) {
        int iHashCode = c0324k.f1130b.hashCode() + (c0324k.f1129a * 31);
        if (i10 >= 2) {
            return (iHashCode * 31) + c0324k.f1133e.hashCode();
        }
        long jM523l = AbstractC0168G.m523l(c0324k.f1133e);
        return (iHashCode * 31) + ((int) (jM523l ^ (jM523l >>> 32)));
    }

    /* JADX INFO: renamed from: w */
    public static C0324k m949w(int i10, DataInputStream dataInputStream) throws IOException {
        C0329p c0329pM56a;
        int i11 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i10 < 2) {
            long j10 = dataInputStream.readLong();
            C0320g c0320g = new C0320g();
            c0320g.m931a(Long.valueOf(j10), "exo_len");
            c0329pM56a = C0329p.f1144c.m967a(c0320g);
        } else {
            c0329pM56a = C0017I0.m56a(dataInputStream);
        }
        return new C0324k(i11, utf, c0329pM56a);
    }

    @Override // p619Zb.InterfaceC10274g
    /* JADX INFO: renamed from: a */
    public ArrayList mo950a(C10539a c10539a) throws C6584a {
        C8026X5[] c8026x5ArrM8454s;
        if (((C8057c) this.f1143e) == null) {
            mo952c();
        }
        C8057c c8057c = (C8057c) this.f1143e;
        if (c8057c == null) {
            throw new C6584a("Error initializing the legacy barcode scanner.", 14);
        }
        C8089g c8089g = new C8089g(c10539a.f31257d, c10539a.f31258e, 0, 0L, AbstractC7897H0.m8194b(c10539a.f31259f));
        try {
            int i10 = c10539a.f31260g;
            if (i10 == -1) {
                BinderC2679b binderC2679b = new BinderC2679b(c10539a.f31254a);
                Parcel parcelM6116m = c8057c.m6116m();
                AbstractC7840A.m8088a(parcelM6116m, binderC2679b);
                parcelM6116m.writeInt(1);
                c8089g.writeToParcel(parcelM6116m, 0);
                Parcel parcelM6117n = c8057c.m6117n(parcelM6116m, 2);
                C8026X5[] c8026x5Arr = (C8026X5[]) parcelM6117n.createTypedArray(C8026X5.CREATOR);
                parcelM6117n.recycle();
                c8026x5ArrM8454s = c8026x5Arr;
            } else if (i10 == 17) {
                c8026x5ArrM8454s = c8057c.m8454s(new BinderC2679b(c10539a.f31255b), c8089g);
            } else if (i10 == 35) {
                Image.Plane[] planeArrM10980a = c10539a.m10980a();
                AbstractC20502t.m21157h(planeArrM10980a);
                c8089g.f25413Y = planeArrM10980a[0].getRowStride();
                c8026x5ArrM8454s = c8057c.m8454s(new BinderC2679b(planeArrM10980a[0].getBuffer()), c8089g);
            } else {
                if (i10 != 842094169) {
                    throw new C6584a("Unsupported image format: " + c10539a.f31260g, 3);
                }
                c8026x5ArrM8454s = c8057c.m8454s(new BinderC2679b(AbstractC7972Q3.m8260a(c10539a)), c8089g);
            }
            ArrayList arrayList = new ArrayList();
            for (C8026X5 c8026x5 : c8026x5ArrM8454s) {
                arrayList.add(new C9430a(new C9642z(c8026x5, 2)));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new C6584a(13, e10, "Failed to detect with legacy barcode detector");
        }
    }

    @Override // p619Zb.InterfaceC10274g
    /* JADX INFO: renamed from: b */
    public void mo951b() {
        C8057c c8057c = (C8057c) this.f1143e;
        if (c8057c != null) {
            try {
                c8057c.m6118o(c8057c.m6116m(), 3);
            } catch (RemoteException e10) {
                AbstractC15256t.m16466d("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e10);
            }
            this.f1143e = null;
        }
    }

    @Override // p619Zb.InterfaceC10274g
    /* JADX INFO: renamed from: c */
    public boolean mo952c() throws C6584a {
        InterfaceC8081f c8065d;
        Context context = (Context) this.f1140b;
        if (((C8057c) this.f1143e) != null) {
            return false;
        }
        try {
            IBinder iBinderM3872b = C3020f.m3866c(context, C3020f.f9095b, "com.google.android.gms.vision.dynamite").m3872b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
            int i10 = AbstractBinderC8073e.f25388b;
            if (iBinderM3872b == null) {
                c8065d = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderM3872b.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                c8065d = iInterfaceQueryLocalInterface instanceof InterfaceC8081f ? (InterfaceC8081f) iInterfaceQueryLocalInterface : new C8065d(iBinderM3872b, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", 3);
            }
            C8057c c8057cM8473s = ((C8065d) c8065d).m8473s(new BinderC2679b(context), (C8049b) this.f1141c);
            this.f1143e = c8057cM8473s;
            C8232x6 c8232x6 = (C8232x6) this.f1142d;
            if (c8057cM8473s == null && !this.f1139a) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                AbstractC7606h.m7953a(context, "barcode");
                this.f1139a = true;
                AbstractC10269b.m10867b(c8232x6, EnumC7901H4.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new C6584a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            AbstractC10269b.m10867b(c8232x6, EnumC7901H4.NO_ERROR);
            return false;
        } catch (C3016b e10) {
            throw new C6584a(13, e10, "Failed to load deprecated vision dynamite module.");
        } catch (RemoteException e11) {
            throw new C6584a(13, e11, "Failed to create legacy barcode detector.");
        }
    }

    @Override // p005A3.InterfaceC0327n
    /* JADX INFO: renamed from: d */
    public void mo940d(C0324k c0324k, boolean z6) {
        this.f1139a = true;
    }

    @Override // p005A3.InterfaceC0327n
    public void delete() {
        C11232c c11232c = (C11232c) this.f1142d;
        ((File) c11232c.f33996Y).delete();
        ((File) c11232c.f33997Z).delete();
    }

    @Override // p162G6.InterfaceC3004a
    public void dispose() throws IOException {
        Iterator it = ((ArrayList) this.f1142d).iterator();
        while (it.hasNext()) {
            ((InterfaceC3250f) it.next()).getClass();
        }
        ((InterfaceC3247c) this.f1141c).close();
    }

    @Override // p953q0.InterfaceC18560S
    /* JADX INFO: renamed from: e */
    public InterfaceC18559Q mo953e(int i10, int i11, int i12, long j10) {
        C18834f c18834f = (C18834f) this.f1140b;
        Object objMo5912c = c18834f.mo5912c(i10);
        Object objM19931j = c18834f.f59941b.m19931j(i10);
        List listM19938a = ((C18558P) this.f1141c).m19938a(i10, j10);
        C18839k c18839k = (C18839k) this.f1143e;
        boolean z6 = c18839k.f59965f;
        C10846a c10846a = c18839k.f59960a.f60059r;
        return new C18845q(i10, objMo5912c, listM19938a, z6, c18839k.f59972m, i11, i12, c18839k.f59969j, c18839k.f59970k, objM19931j, c10846a, j10);
    }

    @Override // p005A3.InterfaceC0327n
    /* JADX INFO: renamed from: f */
    public void mo941f(C0324k c0324k) {
        this.f1139a = true;
    }

    @Override // p005A3.InterfaceC0327n
    /* JADX INFO: renamed from: g */
    public void mo942g(HashMap map) throws Throwable {
        C11232c c11232c = (C11232c) this.f1142d;
        DataOutputStream dataOutputStream = null;
        try {
            C20799a c20799aM12494r = c11232c.m12494r();
            C0332s c0332s = (C0332s) this.f1143e;
            if (c0332s == null) {
                this.f1143e = new C0332s(c20799aM12494r);
            } else {
                c0332s.m969a(c20799aM12494r);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream((C0332s) this.f1143e);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(map.size());
                int iM948r = 0;
                for (C0324k c0324k : map.values()) {
                    dataOutputStream2.writeInt(c0324k.f1129a);
                    dataOutputStream2.writeUTF(c0324k.f1130b);
                    C0017I0.m57b(c0324k.f1133e, dataOutputStream2);
                    iM948r += m948r(c0324k, 2);
                }
                dataOutputStream2.writeInt(iM948r);
                dataOutputStream2.close();
                ((File) c11232c.f33997Z).delete();
                int i10 = AbstractC20817s.f66106a;
                this.f1139a = false;
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                AbstractC20817s.m21406g(dataOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // p162G6.InterfaceC3004a
    /* JADX INFO: renamed from: h */
    public InterfaceC2184i mo954h(C17852e request) throws EOFException {
        boolean z6;
        C14522e c14522e;
        AbstractC16544l.m18094g(request, "request");
        C17849b c17849b = C17867t.f56959e;
        InterfaceC17835C interfaceC17835C = request.f56923c;
        InterfaceC17833A interfaceC17833AMo4141d = interfaceC17835C.mo4141d(c17849b);
        AbstractC16544l.m18091d(interfaceC17833AMo4141d);
        C17867t c17867t = (C17867t) interfaceC17833AMo4141d;
        C4613f c4613f = (C4613f) this.f1140b;
        C17867t customScalarAdapters = (C17867t) interfaceC17835C.mo4141d(c17849b);
        if (customScalarAdapters == null) {
            customScalarAdapters = C17867t.f56960f;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C18299c(SIPHeaderNames.ACCEPT, "multipart/mixed;deferSpec=20220824, application/json"));
        AbstractList abstractList = request.f56925e;
        if (abstractList != null) {
            arrayList.addAll(abstractList);
        }
        Boolean bool = request.f56926f;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = request.f56927g;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        EnumC18300d enumC18300d = request.f56924d;
        if (enumC18300d == null) {
            enumC18300d = EnumC18300d.f58414Z;
        }
        int iOrdinal = enumC18300d.ordinal();
        InterfaceC17842J interfaceC17842J = request.f56921a;
        String str = c4613f.f15035Y;
        if (iOrdinal == 0) {
            EnumC18300d enumC18300d2 = EnumC18300d.f58413Y;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("operationName", interfaceC17842J.name());
            C0675i c0675i = new C0675i();
            C19802a c19802a = new C19802a(new C19451a(c0675i, null));
            c19802a.mo20554o();
            interfaceC17842J.mo19592e(c19802a, customScalarAdapters);
            c19802a.mo20551j();
            if (!c19802a.f62825Z.isEmpty()) {
                throw new IllegalStateException("FileUpload and Http GET are not supported at the same time");
            }
            linkedHashMap.put("variables", c0675i.m1428Z0());
            if (zBooleanValue2) {
                linkedHashMap.put("query", interfaceC17842J.mo19591d());
            }
            if (zBooleanValue) {
                C0675i c0675i2 = new C0675i();
                C19451a c19451a = new C19451a(c0675i2, null);
                c19451a.mo20554o();
                c19451a.mo20545M0("persistedQuery");
                c19451a.mo20554o();
                c19451a.mo20545M0("version");
                z6 = true;
                c19451a.mo20540C(1);
                c19451a.mo20545M0("sha256Hash");
                c19451a.mo20544L(interfaceC17842J.mo19590c());
                c19451a.mo20551j();
                c19451a.mo20551j();
                linkedHashMap.put("extensions", c0675i2.m1428Z0());
            } else {
                z6 = true;
            }
            AbstractC16544l.m18094g(str, "<this>");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            boolean zM21667A = AbstractC21322p.m21667A(str, Separators.QUESTION, false);
            boolean z10 = zM21667A;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (z10) {
                    sb2.append('&');
                } else {
                    sb2.append('?');
                    z10 = z6;
                }
                sb2.append(AbstractC3751J.m4446k((String) entry.getKey()));
                sb2.append('=');
                sb2.append(AbstractC3751J.m4446k((String) entry.getValue()));
            }
            String string = sb2.toString();
            AbstractC16544l.m18093f(string, "toString(...)");
            c14522e = new C14522e(enumC18300d2, string);
            ((ArrayList) c14522e.f45763o0).add(new C18299c("Apollo-Require-Preflight", "true"));
        } else {
            if (iOrdinal != 1) {
                throw new C0644w();
            }
            String strMo19591d = zBooleanValue2 ? interfaceC17842J.mo19591d() : null;
            AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
            String strMo19590c = interfaceC17842J.mo19590c();
            C0675i c0675i3 = new C0675i();
            C19451a c19451a2 = new C19451a(c0675i3, null);
            c19451a2.mo20554o();
            c19451a2.mo20545M0("operationName");
            c19451a2.mo20544L(interfaceC17842J.name());
            c19451a2.mo20545M0("variables");
            C19802a c19802a2 = new C19802a(c19451a2);
            c19802a2.mo20554o();
            interfaceC17842J.mo19592e(c19802a2, customScalarAdapters);
            c19802a2.mo20551j();
            LinkedHashMap linkedHashMap2 = c19802a2.f62825Z;
            if (strMo19591d != null) {
                c19451a2.mo20545M0("query");
                c19451a2.mo20544L(strMo19591d);
            }
            if (zBooleanValue) {
                c19451a2.mo20545M0("extensions");
                c19451a2.mo20554o();
                c19451a2.mo20545M0("persistedQuery");
                c19451a2.mo20554o();
                c19451a2.mo20545M0("version");
                c19451a2.mo20540C(1);
                c19451a2.mo20545M0("sha256Hash");
                c19451a2.mo20544L(strMo19590c);
                c19451a2.mo20551j();
                c19451a2.mo20551j();
            }
            c19451a2.mo20551j();
            C0678l c0678lM1417C0 = c0675i3.m1417C0(c0675i3.f1970Z);
            InterfaceC18298b c1918i = linkedHashMap2.isEmpty() ? new C1918i(c0678lM1417C0) : new C18302f(linkedHashMap2, c0678lM1417C0);
            c14522e = new C14522e(EnumC18300d.f58414Z, str);
            c14522e.f45762Z = c1918i;
            if (AbstractC21329w.m21734u(c1918i.getContentType(), "multipart/form-data", false)) {
                ((ArrayList) c14522e.f45763o0).add(new C18299c("Apollo-Require-Preflight", "true"));
            }
        }
        c14522e.m16013c(arrayList);
        c14522e.f45765q0 = ((InterfaceC17835C) c14522e.f45765q0).mo4139b(interfaceC17835C);
        return new C2219z0(new C3252h(this, c14522e.m16015f(), request, c17867t, null));
    }

    @Override // p005A3.InterfaceC0327n
    /* JADX INFO: renamed from: i */
    public boolean mo943i() {
        C11232c c11232c = (C11232c) this.f1142d;
        return ((File) c11232c.f33996Y).exists() || ((File) c11232c.f33997Z).exists();
    }

    @Override // p005A3.InterfaceC0327n
    /* JADX INFO: renamed from: j */
    public void mo944j(HashMap map) throws Throwable {
        if (this.f1139a) {
            mo942g(map);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0082 A[Catch: all -> 0x006b, IOException -> 0x006e, TRY_LEAVE, TryCatch #4 {IOException -> 0x006e, all -> 0x006b, blocks: (B:8:0x002e, B:13:0x0038, B:20:0x004c, B:21:0x0056, B:22:0x005f, B:29:0x0073, B:30:0x0078, B:31:0x0079, B:33:0x0082, B:35:0x0088, B:36:0x0097), top: B:58:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    @Override // p005A3.InterfaceC0327n
    /* JADX INFO: renamed from: l */
    public void mo946l(HashMap map, SparseArray sparseArray) throws Throwable {
        int i10;
        int i11;
        int iM948r;
        int i12;
        AbstractC20800b.m21320h(!this.f1139a);
        C11232c c11232c = (C11232c) this.f1142d;
        boolean zExists = ((File) c11232c.f33996Y).exists();
        File file = (File) c11232c.f33997Z;
        if (zExists || file.exists()) {
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(c11232c.m12491o());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i13 = dataInputStream2.readInt();
                    if (i13 >= 0 && i13 <= 2) {
                        if ((dataInputStream2.readInt() & 1) == 0) {
                            i10 = dataInputStream2.readInt();
                            iM948r = 0;
                            for (i11 = 0; i11 < i10; i11++) {
                                C0324k c0324kM949w = m949w(i13, dataInputStream2);
                                String str = c0324kM949w.f1130b;
                                map.put(str, c0324kM949w);
                                sparseArray.put(c0324kM949w.f1129a, str);
                                iM948r += m948r(c0324kM949w, i13);
                            }
                            i12 = dataInputStream2.readInt();
                            boolean z6 = dataInputStream2.read() == -1;
                            if (i12 == iM948r && z6) {
                                AbstractC20817s.m21406g(dataInputStream2);
                                return;
                            }
                        } else {
                            Cipher cipher = (Cipher) this.f1140b;
                            if (cipher != null) {
                                byte[] bArr = new byte[16];
                                dataInputStream2.readFully(bArr);
                                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                try {
                                    SecretKeySpec secretKeySpec = (SecretKeySpec) this.f1141c;
                                    int i14 = AbstractC20817s.f66106a;
                                    cipher.init(2, secretKeySpec, ivParameterSpec);
                                    dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                                    i10 = dataInputStream2.readInt();
                                    iM948r = 0;
                                    while (i11 < i10) {
                                        C0324k c0324kM949w2 = m949w(i13, dataInputStream2);
                                        String str2 = c0324kM949w2.f1130b;
                                        map.put(str2, c0324kM949w2);
                                        sparseArray.put(c0324kM949w2.f1129a, str2);
                                        iM948r += m948r(c0324kM949w2, i13);
                                    }
                                    i12 = dataInputStream2.readInt();
                                    if (dataInputStream2.read() == -1) {
                                    }
                                    if (i12 == iM948r) {
                                        AbstractC20817s.m21406g(dataInputStream2);
                                        return;
                                    }
                                } catch (InvalidAlgorithmParameterException e10) {
                                    e = e10;
                                    throw new IllegalStateException(e);
                                } catch (InvalidKeyException e11) {
                                    e = e11;
                                    throw new IllegalStateException(e);
                                }
                            }
                        }
                    }
                    AbstractC20817s.m21406g(dataInputStream2);
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        AbstractC20817s.m21406g(dataInputStream);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        AbstractC20817s.m21406g(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
            map.clear();
            sparseArray.clear();
            ((File) c11232c.f33996Y).delete();
            file.delete();
        }
    }

    /* JADX INFO: renamed from: m */
    public IOException m955m(boolean z6, boolean z10, IOException iOException) {
        if (iOException != null) {
            m964y(iOException);
        }
        C18792h call = (C18792h) this.f1140b;
        if (z10) {
            if (iOException != null) {
                AbstractC16544l.m18094g(call, "call");
            } else {
                AbstractC16544l.m18094g(call, "call");
            }
        }
        if (z6) {
            if (iOException != null) {
                AbstractC16544l.m18094g(call, "call");
            } else {
                AbstractC16544l.m18094g(call, "call");
            }
        }
        return call.m20066h(this, z10, z6, iOException);
    }

    /* JADX INFO: renamed from: n */
    public void m956n(C21660F c21660f, float f10, long j10) {
        float fFloatValue = ((Number) ((C13756d) this.f1141c).m15224e()).floatValue();
        if (fFloatValue > 0.0f) {
            long jM15774b = C14365u.m15774b(fFloatValue, j10);
            if (!this.f1139a) {
                c21660f.mo17591U(jM15774b, (112 & 2) != 0 ? C13803e.m15332d(c21660f.mo17602i()) / 2.0f : f10, (112 & 4) != 0 ? c21660f.mo17604o0() : 0L, (112 & 8) != 0 ? 1.0f : 0.0f, (112 & 16) != 0 ? C16042g.f49483a : null, null, 3);
                return;
            }
            float fM15333e = C13803e.m15333e(c21660f.mo17602i());
            float fM15331c = C13803e.m15331c(c21660f.mo17602i());
            C13711h c13711h = c21660f.f68674Y.f49479Z;
            long jM15202x = c13711h.m15202x();
            c13711h.m15196m().mo15706e();
            try {
                ((C10077b) c13711h.f43259Z).m10675z(0.0f, 0.0f, fM15333e, fM15331c, 1);
                c21660f.mo17591U(jM15774b, (112 & 2) != 0 ? C13803e.m15332d(c21660f.mo17602i()) / 2.0f : f10, (112 & 4) != 0 ? c21660f.mo17604o0() : 0L, (112 & 8) != 0 ? 1.0f : 0.0f, (112 & 16) != 0 ? C16042g.f49483a : null, null, 3);
            } finally {
                AbstractC12107L1.m13830u(c13711h, jM15202x);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public C18845q m957p(int i10, long j10) {
        int i11;
        long jM9966i;
        C18834f c18834f = (C18834f) this.f1140b;
        Object objMo5912c = c18834f.mo5912c(i10);
        Object objM19931j = c18834f.f59941b.m19931j(i10);
        C18848t c18848t = (C18848t) this.f1142d;
        int[] iArr = c18848t.f60030b;
        int length = iArr.length;
        int i12 = (int) (j10 >> 32);
        int i13 = length - 1;
        if (i12 <= i13) {
            i13 = i12;
        }
        int i14 = ((int) (j10 & 4294967295L)) - i12;
        int i15 = length - i13;
        if (i14 > i15) {
            i14 = i15;
        }
        if (i14 == 1) {
            i11 = iArr[i13];
        } else {
            int[] iArr2 = c18848t.f60029a;
            int i16 = (i13 + i14) - 1;
            i11 = (iArr2[i16] + iArr[i16]) - iArr2[i13];
        }
        if (this.f1139a) {
            if (i11 < 0) {
                AbstractC9406z4.m9983b("width(" + i11 + ") must be >= 0");
                throw null;
            }
            jM9966i = AbstractC9388w4.m9966i(i11, i11, 0, Integer.MAX_VALUE);
        } else {
            if (i11 < 0) {
                AbstractC9406z4.m9983b("height(" + i11 + ") must be >= 0");
                throw null;
            }
            jM9966i = AbstractC9388w4.m9966i(0, Integer.MAX_VALUE, i11, i11);
        }
        long j11 = jM9966i;
        List listM19938a = ((C18558P) this.f1141c).m19938a(i10, j11);
        C18839k c18839k = (C18839k) this.f1143e;
        return new C18845q(i10, objMo5912c, listM19938a, c18839k.f59965f, c18839k.f59972m, i13, i14, c18839k.f59969j, c18839k.f59970k, objM19931j, c18839k.f59960a.f60059r, j11);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: q */
    public void m958q(InterfaceC17405k interfaceC17405k, InterfaceC0571F interfaceC0571F) {
        float f10;
        boolean z6 = interfaceC17405k instanceof C17402h;
        ArrayList arrayList = (ArrayList) this.f1142d;
        if (z6) {
            arrayList.add(interfaceC17405k);
        } else if (interfaceC17405k instanceof C17403i) {
            arrayList.remove(((C17403i) interfaceC17405k).f55598a);
        } else if (interfaceC17405k instanceof C17398d) {
            arrayList.add(interfaceC17405k);
        } else if (interfaceC17405k instanceof C17399e) {
            arrayList.remove(((C17399e) interfaceC17405k).f55591a);
        } else if (interfaceC17405k instanceof C17396b) {
            arrayList.add(interfaceC17405k);
        } else if (interfaceC17405k instanceof C17397c) {
            arrayList.remove(((C17397c) interfaceC17405k).f55590a);
        } else if (!(interfaceC17405k instanceof C17395a)) {
            return;
        } else {
            arrayList.remove(((C17395a) interfaceC17405k).f55589a);
        }
        InterfaceC17405k interfaceC17405k2 = (InterfaceC17405k) AbstractC17680n.m19353c0(arrayList);
        if (AbstractC16544l.m18089b((InterfaceC17405k) this.f1143e, interfaceC17405k2)) {
            return;
        }
        if (interfaceC17405k2 != null) {
            C3551h c3551h = (C3551h) ((AbstractC16546n) this.f1140b).invoke();
            if (z6) {
                f10 = c3551h.f10761c;
            } else if (interfaceC17405k instanceof C17398d) {
                f10 = c3551h.f10760b;
            } else {
                f10 = interfaceC17405k instanceof C17396b ? c3551h.f10759a : 0.0f;
            }
            C13781p0 c13781p0 = AbstractC3564u.f10803a;
            boolean z10 = interfaceC17405k2 instanceof C17402h;
            C13781p0 c13781p1 = AbstractC3564u.f10803a;
            if (!z10 && ((interfaceC17405k2 instanceof C17398d) || (interfaceC17405k2 instanceof C17396b))) {
                c13781p1 = new C13781p0(45, AbstractC13725A.f43291d, 2);
            }
            AbstractC0575H.m1156D(interfaceC0571F, null, null, new C3540A(this, f10, c13781p1, null), 3);
        } else {
            InterfaceC17405k interfaceC17405k3 = (InterfaceC17405k) this.f1143e;
            C13781p0 c13781p2 = AbstractC3564u.f10803a;
            boolean z11 = interfaceC17405k3 instanceof C17402h;
            C13781p0 c13781p3 = AbstractC3564u.f10803a;
            if (!z11 && !(interfaceC17405k3 instanceof C17398d) && (interfaceC17405k3 instanceof C17396b)) {
                c13781p3 = new C13781p0(150, AbstractC13725A.f43291d, 2);
            }
            AbstractC0575H.m1156D(interfaceC0571F, null, null, new C3541B(this, c13781p3, null), 3);
        }
        this.f1143e = interfaceC17405k2;
    }

    /* JADX INFO: renamed from: s */
    public C18794j m959s() throws SocketException {
        C18792h c18792h = (C18792h) this.f1140b;
        if (c18792h.f59730v0) {
            throw new IllegalStateException("Check failed.");
        }
        c18792h.f59730v0 = true;
        c18792h.f59725q0.m1414j();
        C18795k connection = ((InterfaceC19259c) this.f1142d).getConnection();
        connection.getClass();
        Socket socket = connection.f59741d;
        AbstractC16544l.m18091d(socket);
        C0657F c0657f = connection.f59745h;
        AbstractC16544l.m18091d(c0657f);
        C0656E c0656e = connection.f59746i;
        AbstractC16544l.m18091d(c0656e);
        socket.setSoTimeout(0);
        connection.m20080l();
        return new C18794j(c0657f, c0656e, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public int m961u(C19662a c19662a, AndroidComposeView androidComposeView, boolean z6) {
        int i10;
        Object[] objArr;
        C5311e c5311e;
        int i11;
        C21713r c21713r = (C21713r) this.f1143e;
        if (this.f1139a) {
            return 0;
        }
        try {
            this.f1139a = true;
            C0093v0 c0093v0M10207T = ((C9642z) this.f1142d).m10207T(c19662a, androidComposeView);
            C12977p c12977p = (C12977p) c0093v0M10207T.f404o0;
            int iM14670j = c12977p.m14670j();
            while (true) {
                if (i10 >= iM14670j) {
                    objArr = true;
                    break;
                }
                C19738o c19738o = (C19738o) c12977p.m14671k(i10);
                i10 = (c19738o.f62481d || c19738o.f62485h) ? 0 : i10 + 1;
                objArr = false;
                break;
            }
            int iM14670j2 = c12977p.m14670j();
            int i12 = 0;
            while (true) {
                c5311e = (C5311e) this.f1141c;
                if (i12 >= iM14670j2) {
                    break;
                }
                C19738o c19738o2 = (C19738o) c12977p.m14671k(i12);
                if (objArr != false || AbstractC19736m.m20679a(c19738o2)) {
                    ((C21658D) this.f1140b).m22015M(c19738o2.f62480c, (C21713r) this.f1143e, AbstractC19736m.m20683e(c19738o2.f62486i, 1), true);
                    if (!c21713r.isEmpty()) {
                        c5311e.m5860o(c19738o2.f62478a, c21713r, AbstractC19736m.m20679a(c19738o2));
                        c21713r.clear();
                    }
                }
                i12++;
            }
            ((C10077b) c5311e.f17485o0).m10661I();
            boolean zM5862r = c5311e.m5862r(c0093v0M10207T, z6);
            if (!c0093v0M10207T.f403Z) {
                int iM14670j3 = c12977p.m14670j();
                for (int i13 = 0; i13 < iM14670j3; i13++) {
                    C19738o c19738o3 = (C19738o) c12977p.m14671k(i13);
                    if (!C13800b.m15303d(AbstractC19736m.m20687i(c19738o3, true), 0L) && c19738o3.m20692b()) {
                        i11 = 2;
                        int i14 = (zM5862r ? 1 : 0) | i11;
                        this.f1139a = false;
                        return i14;
                    }
                }
            }
            i11 = 0;
            int i15 = (zM5862r ? 1 : 0) | i11;
            this.f1139a = false;
            return i15;
        } catch (Throwable th2) {
            this.f1139a = false;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: v */
    public void m962v() {
        if (this.f1139a) {
            return;
        }
        ((C12977p) ((C9642z) this.f1142d).f29064Z).m14662b();
        C5311e c5311e = (C5311e) this.f1141c;
        C6546d c6546d = (C6546d) ((C10077b) c5311e.f17485o0).f29833Z;
        int i10 = c6546d.f21184o0;
        if (i10 > 0) {
            Object[] objArr = c6546d.f21182Y;
            int i11 = 0;
            do {
                ((C19728e) objArr[i11]).m20672O();
                i11++;
            } while (i11 < i10);
        }
        ((C6546d) ((C10077b) c5311e.f17485o0).f29833Z).m7104i();
    }

    /* JADX INFO: renamed from: x */
    public C17326C m963x(boolean z6) throws IOException {
        try {
            C17326C c17326cMo18932e = ((InterfaceC19259c) this.f1142d).mo18932e(z6);
            if (c17326cMo18932e != null) {
                c17326cMo18932e.f55172m = this;
            }
            return c17326cMo18932e;
        } catch (IOException e10) {
            C18792h call = (C18792h) this.f1140b;
            AbstractC16544l.m18094g(call, "call");
            m964y(e10);
            throw e10;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m964y(IOException iOException) {
        this.f1139a = true;
        ((C18788d) this.f1141c).m20058c(iOException);
        C18795k connection = ((InterfaceC19259c) this.f1142d).getConnection();
        C18792h call = (C18792h) this.f1140b;
        synchronized (connection) {
            try {
                AbstractC16544l.m18094g(call, "call");
                if (!(iOException instanceof C20035z)) {
                    if (!(connection.f59744g != null) || (iOException instanceof C20010a)) {
                        connection.f59747j = true;
                        if (connection.f59750m == 0) {
                            C18795k.m20069d(call.f59721Y, connection.f59739b, iOException);
                            connection.f59749l++;
                        }
                    }
                } else if (((C20035z) iOException).f63454Y == 8) {
                    int i10 = connection.f59751n + 1;
                    connection.f59751n = i10;
                    if (i10 > 1) {
                        connection.f59747j = true;
                        connection.f59749l++;
                    }
                } else if (((C20035z) iOException).f63454Y != 9 || !call.f59718A0) {
                    connection.f59747j = true;
                    connection.f59749l++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m965z(int i10, int i11) {
        if (i10 >= 0.0f) {
            ((C5996c0) this.f1140b).m6413h(i10);
            ((C18561T) this.f1143e).m19939c(i10);
            ((C5996c0) this.f1141c).m6413h(i11);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i10 + ')').toString());
        }
    }

    /* JADX INFO: renamed from: t */
    public C17328E m960t(C17327D c17327d) throws IOException {
        InterfaceC19259c interfaceC19259c = (InterfaceC19259c) this.f1142d;
        try {
            String strM19012f = c17327d.f55178r0.m19012f(bQBnquXS.crLXbzuat);
            if (strM19012f == null) {
                strM19012f = null;
            }
            long jMo18929b = interfaceC19259c.mo18929b(c17327d);
            return new C17328E(strM19012f, jMo18929b, AbstractC0668b.m1403c(new C18787c(this, interfaceC19259c.mo18931d(c17327d), jMo18929b)), 1);
        } catch (IOException e10) {
            C18792h call = (C18792h) this.f1140b;
            AbstractC16544l.m18094g(call, "call");
            m964y(e10);
            throw e10;
        }
    }

    @Override // p005A3.InterfaceC0327n
    /* JADX INFO: renamed from: k */
    public void mo945k(long j10) {
    }
}
