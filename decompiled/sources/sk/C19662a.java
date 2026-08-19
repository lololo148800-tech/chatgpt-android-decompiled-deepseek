package sk;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseIntArray;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.instrumentation.file.C15378c;
import io.sentry.instrumentation.file.C15379d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import org.json.JSONException;
import org.json.JSONObject;
import p001A.AbstractC0010F;
import p1009s9.C19502e;
import p1016t3.AbstractC19754D;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1033u5.C20116a;
import p1033u5.C20117b;
import p1033u5.C20119d;
import p1033u5.C20120e;
import p1033u5.InterfaceC20122g;
import p103Dn.AbstractC2124C;
import p103Dn.C2146N;
import p103Dn.C2153Q0;
import p1073w3.AbstractC20800b;
import p1086wi.InterfaceC20968a;
import p1095x1.InterfaceC21057K;
import p1140z1.C21658D;
import p1148zb.C21830a;
import p195Hh.C3430e;
import p259K5.C4544f;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;
import p470T4.AbstractC7255t;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p525Vb.C8258a;
import p544W9.AbstractC8746y3;
import p544W9.AbstractC8752z3;
import p734ep.C13458b;
import p832jb.C16187g;
import p929oi.AbstractC18201b;

/* JADX INFO: renamed from: sk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C19662a implements InterfaceC20122g, InterfaceC20968a {

    /* JADX INFO: renamed from: Y */
    public Object f62320Y;

    /* JADX INFO: renamed from: Z */
    public final Object f62321Z;

    public /* synthetic */ C19662a(Object obj, Object obj2) {
        this.f62320Y = obj;
        this.f62321Z = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static C19662a m20630b(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new C19662a(channel, fileLockLock);
                } catch (IOException e10) {
                    e = e10;
                    AbstractC15256t.m16466d("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e11) {
                    e = e11;
                    AbstractC15256t.m16466d("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e12) {
                    e = e12;
                    AbstractC15256t.m16466d("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e13) {
                e = e13;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e14) {
            e = e14;
            channel = null;
            fileLockLock = null;
        }
    }

    @Override // p1033u5.InterfaceC20122g
    /* JADX INFO: renamed from: A */
    public void mo14952A() {
        ((C20120e) this.f62321Z).m3130o(-1);
    }

    @Override // p1086wi.InterfaceC20968a
    /* JADX INFO: renamed from: a */
    public Object mo20631a(String str) {
        try {
            return AbstractC18201b.f58034a.m12903b(str, (KSerializer) this.f62320Y);
        } catch (Exception e10) {
            AbstractC8160o6.m8731f((C3430e) this.f62321Z, "Could not deserialize for store, falling back to null", e10, null, 4);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m20632c(InterfaceC6335q interfaceC6335q, C13458b c13458b) {
        int i10 = 0;
        while (true) {
            InterfaceC6316H[] interfaceC6316HArr = (InterfaceC6316H[]) this.f62321Z;
            if (i10 >= interfaceC6316HArr.length) {
                return;
            }
            c13458b.m14981c();
            c13458b.m14986h();
            InterfaceC6316H interfaceC6316HMo3044D = interfaceC6335q.mo3044D(c13458b.f42594c, 3);
            C19788o c19788o = (C19788o) ((List) this.f62320Y).get(i10);
            String str = c19788o.f62752m;
            AbstractC20800b.m21315c("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = c19788o.f62740a;
            if (str2 == null) {
                c13458b.m14986h();
                str2 = (String) c13458b.f42596e;
            }
            C19787n c19787n = new C19787n();
            c19787n.f62703a = str2;
            c19787n.f62714l = AbstractC19754D.m20711i(str);
            c19787n.f62707e = c19788o.f62744e;
            c19787n.f62706d = c19788o.f62743d;
            c19787n.f62698E = c19788o.f62734F;
            c19787n.f62717o = c19788o.f62755p;
            interfaceC6316HMo3044D.mo4971d(new C19788o(c19787n));
            interfaceC6316HArr[i10] = interfaceC6316HMo3044D;
            i10++;
        }
    }

    /* JADX INFO: renamed from: d */
    public File m20633d() {
        if (((File) this.f62320Y) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f62320Y) == null) {
                        C16187g c16187g = (C16187g) this.f62321Z;
                        c16187g.m17794a();
                        this.f62320Y = new File(c16187g.f50235a.getFilesDir(), "PersistedInstallation." + ((C16187g) this.f62321Z).m17795c() + ".json");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (File) this.f62320Y;
    }

    @Override // p1033u5.InterfaceC20122g
    /* JADX INFO: renamed from: e */
    public void mo14959e(C20116a c20116a, Bitmap bitmap, Map map) {
        int i10;
        int iM7695c = AbstractC7255t.m7695c(bitmap);
        C20120e c20120e = (C20120e) this.f62321Z;
        synchronized (((C8258a) c20120e.f5773g)) {
            i10 = c20120e.f5768b;
        }
        if (iM7695c <= i10) {
            ((C20120e) this.f62321Z).m3126k(c20116a, new C20119d(bitmap, map, iM7695c));
        } else {
            ((C20120e) this.f62321Z).m3127l(c20116a);
            ((C4544f) this.f62320Y).m5310d(c20116a, bitmap, map, iM7695c);
        }
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC21057K m20634f() {
        return (InterfaceC21057K) ((C6002f0) this.f62321Z).getValue();
    }

    /* JADX INFO: renamed from: g */
    public void m20635g(C21830a c21830a) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c21830a.f69280a);
            jSONObject.put("Status", AbstractC0010F.m24h(c21830a.f69281b));
            jSONObject.put("AuthToken", c21830a.f69282c);
            jSONObject.put("RefreshToken", c21830a.f69283d);
            jSONObject.put("TokenCreationEpochInSecs", c21830a.f69285f);
            jSONObject.put("ExpiresInSecs", c21830a.f69284e);
            jSONObject.put("FisError", c21830a.f69286g);
            C16187g c16187g = (C16187g) this.f62321Z;
            c16187g.m17794a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", c16187g.f50235a.getFilesDir());
            C15379d c15379dM9509d = AbstractC8752z3.m9509d(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
            c15379dM9509d.write(jSONObject.toString().getBytes("UTF-8"));
            c15379dM9509d.close();
            if (fileCreateTempFile.renameTo(m20633d())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public C21830a m20636h() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            File fileM20633d = m20633d();
            C15378c c15378cM9492c = AbstractC8746y3.m9492c(fileM20633d, new FileInputStream(fileM20633d));
            while (true) {
                try {
                    int i10 = c15378cM9492c.read(bArr, 0, 16384);
                    if (i10 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } catch (Throwable th2) {
                    try {
                        c15378cM9492c.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            c15378cM9492c.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i11 = AbstractC0010F.m27k(5)[iOptInt];
        if (i11 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i11 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new C21830a(strOptString, i11, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX INFO: renamed from: i */
    public void m20637i() {
        try {
            ((FileLock) this.f62321Z).release();
            ((FileChannel) this.f62320Y).close();
        } catch (IOException e10) {
            AbstractC15256t.m16466d("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    @Override // p1086wi.InterfaceC20968a
    public String toString(Object obj) {
        return AbstractC18201b.f58034a.m12905d((KSerializer) this.f62320Y, obj);
    }

    @Override // p1033u5.InterfaceC20122g
    /* JADX INFO: renamed from: w */
    public C20117b mo14960w(C20116a c20116a) {
        C20119d c20119d = (C20119d) ((C20120e) this.f62321Z).m3122g(c20116a);
        if (c20119d != null) {
            return new C20117b(c20119d.f63744a, c20119d.f63745b);
        }
        return null;
    }

    @Override // p1033u5.InterfaceC20122g
    /* JADX INFO: renamed from: y */
    public void mo14961y(int i10) {
        int i11;
        if (i10 >= 40) {
            mo14952A();
            return;
        }
        if (10 > i10 || i10 >= 20) {
            return;
        }
        C20120e c20120e = (C20120e) this.f62321Z;
        synchronized (((C8258a) c20120e.f5773g)) {
            i11 = c20120e.f5769c;
        }
        c20120e.m3130o(i11 / 2);
    }

    public C19662a(KSerializer serializer) {
        AbstractC16544l.m18094g(serializer, "serializer");
        this.f62320Y = serializer;
        this.f62321Z = AbstractC8168p6.m8749b("JsonPreferenceSerializer", null);
    }

    public C19662a(int i10) {
        switch (i10) {
            case 4:
                C19502e c19502e = C19502e.f61950d;
                this.f62320Y = new SparseIntArray();
                this.f62321Z = c19502e;
                break;
            default:
                C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(null);
                this.f62320Y = c2153q0M3204c;
                this.f62321Z = new C2146N(c2153q0M3204c, 0);
                break;
        }
    }

    public C19662a(C21658D c21658d, InterfaceC21057K interfaceC21057K) {
        this.f62320Y = c21658d;
        this.f62321Z = C5997d.m6430Q(interfaceC21057K, C5975S.f19448r0);
    }

    public C19662a(List list) {
        this.f62320Y = list;
        this.f62321Z = new InterfaceC6316H[list.size()];
    }

    public C19662a(int i10, C4544f c4544f) {
        this.f62320Y = c4544f;
        this.f62321Z = new C20120e(i10, this);
    }

    public C19662a(C16187g c16187g) {
        this.f62321Z = c16187g;
    }
}
