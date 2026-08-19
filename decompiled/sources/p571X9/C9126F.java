package p571X9;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
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
import p523V9.C7960P;
import p523V9.C8013W;
import p961qb.C18661b;
import p961qb.C18662c;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;
import p961qb.InterfaceC18665f;

/* JADX INFO: renamed from: X9.F */
/* JADX INFO: loaded from: classes.dex */
public final class C9126F implements InterfaceC18664e {

    /* JADX INFO: renamed from: f */
    public static final Charset f27882f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final C18662c f27883g = new C18662c(SubscriberAttributeKt.JSON_NAME_KEY, AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(1))));

    /* JADX INFO: renamed from: h */
    public static final C18662c f27884h = new C18662c("value", AbstractC9306j0.m9899r(AbstractC3794B0.m4468C(InterfaceC9114D.class, new C9096A(2))));

    /* JADX INFO: renamed from: i */
    public static final C9120E f27885i = C9120E.f27877b;

    /* JADX INFO: renamed from: a */
    public OutputStream f27886a;

    /* JADX INFO: renamed from: b */
    public final HashMap f27887b;

    /* JADX INFO: renamed from: c */
    public final HashMap f27888c;

    /* JADX INFO: renamed from: d */
    public final C9120E f27889d;

    /* JADX INFO: renamed from: e */
    public final C8013W f27890e = new C8013W(this, 2);

    public C9126F(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, C9120E c9120e) {
        this.f27886a = byteArrayOutputStream;
        this.f27887b = map;
        this.f27888c = map2;
        this.f27889d = c9120e;
    }

    /* JADX INFO: renamed from: f */
    public static int m9661f(C18662c c18662c) {
        InterfaceC9114D interfaceC9114D = (InterfaceC9114D) c18662c.m20037a(InterfaceC9114D.class);
        if (interfaceC9114D != null) {
            return ((C9096A) interfaceC9114D).f27862a;
        }
        throw new C18661b("Field has no @Protobuf config");
    }

    @Override // p961qb.InterfaceC18664e
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC18664e mo8314a(C18662c c18662c, int i10) {
        m9663e(c18662c, i10, true);
        return this;
    }

    @Override // p961qb.InterfaceC18664e
    /* JADX INFO: renamed from: b */
    public final InterfaceC18664e mo8315b(C18662c c18662c, long j10) throws IOException {
        if (j10 != 0) {
            InterfaceC9114D interfaceC9114D = (InterfaceC9114D) c18662c.m20037a(InterfaceC9114D.class);
            if (interfaceC9114D == null) {
                throw new C18661b("Field has no @Protobuf config");
            }
            m9665h(((C9096A) interfaceC9114D).f27862a << 3);
            m9666i(j10);
        }
        return this;
    }

    @Override // p961qb.InterfaceC18664e
    /* JADX INFO: renamed from: c */
    public final InterfaceC18664e mo8316c(C18662c c18662c, Object obj) {
        m9662d(c18662c, obj, true);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final void m9662d(C18662c c18662c, Object obj, boolean z6) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z6 && charSequence.length() == 0) {
                return;
            }
            m9665h((m9661f(c18662c) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f27882f);
            m9665h(bytes.length);
            this.f27886a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m9662d(c18662c, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m9664g(f27885i, c18662c, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z6 && dDoubleValue == 0.0d) {
                return;
            }
            m9665h((m9661f(c18662c) << 3) | 1);
            this.f27886a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z6 && fFloatValue == 0.0f) {
                return;
            }
            m9665h((m9661f(c18662c) << 3) | 5);
            this.f27886a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z6 && jLongValue == 0) {
                return;
            }
            InterfaceC9114D interfaceC9114D = (InterfaceC9114D) c18662c.m20037a(InterfaceC9114D.class);
            if (interfaceC9114D == null) {
                throw new C18661b("Field has no @Protobuf config");
            }
            m9665h(((C9096A) interfaceC9114D).f27862a << 3);
            m9666i(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            m9663e(c18662c, ((Boolean) obj).booleanValue() ? 1 : 0, z6);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z6 && bArr.length == 0) {
                return;
            }
            m9665h((m9661f(c18662c) << 3) | 2);
            m9665h(bArr.length);
            this.f27886a.write(bArr);
            return;
        }
        InterfaceC18663d interfaceC18663d = (InterfaceC18663d) this.f27887b.get(obj.getClass());
        if (interfaceC18663d != null) {
            m9664g(interfaceC18663d, c18662c, obj, z6);
            return;
        }
        InterfaceC18665f interfaceC18665f = (InterfaceC18665f) this.f27888c.get(obj.getClass());
        if (interfaceC18665f != null) {
            C8013W c8013w = this.f27890e;
            c8013w.f25305b = false;
            c8013w.f25307d = c18662c;
            c8013w.f25306c = z6;
            interfaceC18665f.mo3472a(obj, c8013w);
            return;
        }
        if (obj instanceof InterfaceC9102B) {
            m9663e(c18662c, ((InterfaceC9102B) obj).mo9634a(), true);
        } else if (obj instanceof Enum) {
            m9663e(c18662c, ((Enum) obj).ordinal(), true);
        } else {
            m9664g(this.f27889d, c18662c, obj, z6);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9663e(C18662c c18662c, int i10, boolean z6) {
        if (z6 && i10 == 0) {
            return;
        }
        InterfaceC9114D interfaceC9114D = (InterfaceC9114D) c18662c.m20037a(InterfaceC9114D.class);
        if (interfaceC9114D == null) {
            throw new C18661b("Field has no @Protobuf config");
        }
        m9665h(((C9096A) interfaceC9114D).f27862a << 3);
        m9665h(i10);
    }

    /* JADX INFO: renamed from: g */
    public final void m9664g(InterfaceC18663d interfaceC18663d, C18662c c18662c, Object obj, boolean z6) throws IOException {
        C7960P c7960p = new C7960P(2);
        c7960p.f25202Z = 0L;
        try {
            OutputStream outputStream = this.f27886a;
            this.f27886a = c7960p;
            try {
                interfaceC18663d.mo3472a(obj, this);
                this.f27886a = outputStream;
                long j10 = c7960p.f25202Z;
                c7960p.close();
                if (z6 && j10 == 0) {
                    return;
                }
                m9665h((m9661f(c18662c) << 3) | 2);
                m9666i(j10);
                interfaceC18663d.mo3472a(obj, this);
            } catch (Throwable th2) {
                this.f27886a = outputStream;
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
    public final void m9665h(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f27886a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f27886a.write(i10 & 127);
    }

    /* JADX INFO: renamed from: i */
    public final void m9666i(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f27886a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f27886a.write(((int) j10) & 127);
    }
}
