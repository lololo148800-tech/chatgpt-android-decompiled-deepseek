package p523V9;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p228J.AbstractC3794B0;
import p379Pb.LVf.efyhmdM;
import p571X9.AbstractC9306j0;
import p961qb.C18661b;
import p961qb.C18662c;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;
import p961qb.InterfaceC18665f;

/* JADX INFO: renamed from: V9.V */
/* JADX INFO: loaded from: classes.dex */
public final class C8006V implements InterfaceC18664e {

    /* JADX INFO: renamed from: f */
    public static final Charset f25286f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final C18662c f25287g = new C18662c(efyhmdM.MkZgyRIEv, AbstractC9306j0.m9899r(AbstractC3794B0.m4466A(InterfaceC7991T.class, new C7952O(1))));

    /* JADX INFO: renamed from: h */
    public static final C18662c f25288h = new C18662c("value", AbstractC9306j0.m9899r(AbstractC3794B0.m4466A(InterfaceC7991T.class, new C7952O(2))));

    /* JADX INFO: renamed from: i */
    public static final C7999U f25289i = C7999U.f25278b;

    /* JADX INFO: renamed from: a */
    public OutputStream f25290a;

    /* JADX INFO: renamed from: b */
    public final HashMap f25291b;

    /* JADX INFO: renamed from: c */
    public final HashMap f25292c;

    /* JADX INFO: renamed from: d */
    public final C7999U f25293d;

    /* JADX INFO: renamed from: e */
    public final C8013W f25294e = new C8013W(this, 0);

    public C8006V(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, C7999U c7999u) {
        this.f25290a = byteArrayOutputStream;
        this.f25291b = map;
        this.f25292c = map2;
        this.f25293d = c7999u;
    }

    /* JADX INFO: renamed from: f */
    public static int m8313f(C18662c c18662c) {
        InterfaceC7991T interfaceC7991T = (InterfaceC7991T) c18662c.m20037a(InterfaceC7991T.class);
        if (interfaceC7991T != null) {
            return ((C7952O) interfaceC7991T).f25185a;
        }
        throw new C18661b("Field has no @Protobuf config");
    }

    @Override // p961qb.InterfaceC18664e
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC18664e mo8314a(C18662c c18662c, int i10) {
        m8318e(c18662c, i10, true);
        return this;
    }

    @Override // p961qb.InterfaceC18664e
    /* JADX INFO: renamed from: b */
    public final InterfaceC18664e mo8315b(C18662c c18662c, long j10) throws IOException {
        if (j10 != 0) {
            InterfaceC7991T interfaceC7991T = (InterfaceC7991T) c18662c.m20037a(InterfaceC7991T.class);
            if (interfaceC7991T == null) {
                throw new C18661b("Field has no @Protobuf config");
            }
            m8320h(((C7952O) interfaceC7991T).f25185a << 3);
            m8321i(j10);
        }
        return this;
    }

    @Override // p961qb.InterfaceC18664e
    /* JADX INFO: renamed from: c */
    public final InterfaceC18664e mo8316c(C18662c c18662c, Object obj) {
        m8317d(c18662c, obj, true);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final void m8317d(C18662c c18662c, Object obj, boolean z6) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z6 && charSequence.length() == 0) {
                return;
            }
            m8320h((m8313f(c18662c) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f25286f);
            m8320h(bytes.length);
            this.f25290a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m8317d(c18662c, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m8319g(f25289i, c18662c, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z6 && dDoubleValue == 0.0d) {
                return;
            }
            m8320h((m8313f(c18662c) << 3) | 1);
            this.f25290a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z6 && fFloatValue == 0.0f) {
                return;
            }
            m8320h((m8313f(c18662c) << 3) | 5);
            this.f25290a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z6 && jLongValue == 0) {
                return;
            }
            InterfaceC7991T interfaceC7991T = (InterfaceC7991T) c18662c.m20037a(InterfaceC7991T.class);
            if (interfaceC7991T == null) {
                throw new C18661b("Field has no @Protobuf config");
            }
            m8320h(((C7952O) interfaceC7991T).f25185a << 3);
            m8321i(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            m8318e(c18662c, ((Boolean) obj).booleanValue() ? 1 : 0, z6);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z6 && bArr.length == 0) {
                return;
            }
            m8320h((m8313f(c18662c) << 3) | 2);
            m8320h(bArr.length);
            this.f25290a.write(bArr);
            return;
        }
        InterfaceC18663d interfaceC18663d = (InterfaceC18663d) this.f25291b.get(obj.getClass());
        if (interfaceC18663d != null) {
            m8319g(interfaceC18663d, c18662c, obj, z6);
            return;
        }
        InterfaceC18665f interfaceC18665f = (InterfaceC18665f) this.f25292c.get(obj.getClass());
        if (interfaceC18665f != null) {
            C8013W c8013w = this.f25294e;
            c8013w.f25305b = false;
            c8013w.f25307d = c18662c;
            c8013w.f25306c = z6;
            interfaceC18665f.mo3472a(obj, c8013w);
            return;
        }
        if (obj instanceof InterfaceC7968Q) {
            m8318e(c18662c, ((InterfaceC7968Q) obj).mo8189a(), true);
        } else if (obj instanceof Enum) {
            m8318e(c18662c, ((Enum) obj).ordinal(), true);
        } else {
            m8319g(this.f25293d, c18662c, obj, z6);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8318e(C18662c c18662c, int i10, boolean z6) {
        if (z6 && i10 == 0) {
            return;
        }
        InterfaceC7991T interfaceC7991T = (InterfaceC7991T) c18662c.m20037a(InterfaceC7991T.class);
        if (interfaceC7991T == null) {
            throw new C18661b("Field has no @Protobuf config");
        }
        m8320h(((C7952O) interfaceC7991T).f25185a << 3);
        m8320h(i10);
    }

    /* JADX INFO: renamed from: g */
    public final void m8319g(InterfaceC18663d interfaceC18663d, C18662c c18662c, Object obj, boolean z6) throws IOException {
        C7960P c7960p = new C7960P(0);
        c7960p.f25202Z = 0L;
        try {
            OutputStream outputStream = this.f25290a;
            this.f25290a = c7960p;
            try {
                interfaceC18663d.mo3472a(obj, this);
                this.f25290a = outputStream;
                long j10 = c7960p.f25202Z;
                c7960p.close();
                if (z6 && j10 == 0) {
                    return;
                }
                m8320h((m8313f(c18662c) << 3) | 2);
                m8321i(j10);
                interfaceC18663d.mo3472a(obj, this);
            } catch (Throwable th2) {
                this.f25290a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c7960p.close();
            } catch (Throwable th4) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                } catch (Exception unused) {
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m8320h(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f25290a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f25290a.write(i10 & 127);
    }

    /* JADX INFO: renamed from: i */
    public final void m8321i(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f25290a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f25290a.write(((int) j10) & 127);
    }
}
