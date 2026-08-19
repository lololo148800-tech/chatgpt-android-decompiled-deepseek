package p594Y9;

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
import p523V9.C7960P;
import p523V9.C8013W;
import p571X9.AbstractC9306j0;
import p961qb.C18661b;
import p961qb.C18662c;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;
import p961qb.InterfaceC18665f;

/* JADX INFO: renamed from: Y9.J */
/* JADX INFO: loaded from: classes.dex */
public final class C9747J implements InterfaceC18664e {

    /* JADX INFO: renamed from: f */
    public static final Charset f29274f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final C18662c f29275g = new C18662c(SubscriberAttributeKt.JSON_NAME_KEY, AbstractC9306j0.m9899r(AbstractC9306j0.m9897p(InterfaceC9735H.class, new C9717E(1))));

    /* JADX INFO: renamed from: h */
    public static final C18662c f29276h = new C18662c("value", AbstractC9306j0.m9899r(AbstractC9306j0.m9897p(InterfaceC9735H.class, new C9717E(2))));

    /* JADX INFO: renamed from: i */
    public static final C9741I f29277i = C9741I.f29263b;

    /* JADX INFO: renamed from: a */
    public OutputStream f29278a;

    /* JADX INFO: renamed from: b */
    public final HashMap f29279b;

    /* JADX INFO: renamed from: c */
    public final HashMap f29280c;

    /* JADX INFO: renamed from: d */
    public final C9741I f29281d;

    /* JADX INFO: renamed from: e */
    public final C8013W f29282e = new C8013W(this, 3);

    public C9747J(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, C9741I c9741i) {
        this.f29278a = byteArrayOutputStream;
        this.f29279b = map;
        this.f29280c = map2;
        this.f29281d = c9741i;
    }

    /* JADX INFO: renamed from: f */
    public static int m10341f(C18662c c18662c) {
        InterfaceC9735H interfaceC9735H = (InterfaceC9735H) c18662c.m20037a(InterfaceC9735H.class);
        if (interfaceC9735H != null) {
            return ((C9717E) interfaceC9735H).f29245a;
        }
        throw new C18661b("Field has no @Protobuf config");
    }

    @Override // p961qb.InterfaceC18664e
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC18664e mo8314a(C18662c c18662c, int i10) {
        m10343e(c18662c, i10, true);
        return this;
    }

    @Override // p961qb.InterfaceC18664e
    /* JADX INFO: renamed from: b */
    public final InterfaceC18664e mo8315b(C18662c c18662c, long j10) throws IOException {
        if (j10 != 0) {
            InterfaceC9735H interfaceC9735H = (InterfaceC9735H) c18662c.m20037a(InterfaceC9735H.class);
            if (interfaceC9735H == null) {
                throw new C18661b("Field has no @Protobuf config");
            }
            m10345h(((C9717E) interfaceC9735H).f29245a << 3);
            m10346i(j10);
        }
        return this;
    }

    @Override // p961qb.InterfaceC18664e
    /* JADX INFO: renamed from: c */
    public final InterfaceC18664e mo8316c(C18662c c18662c, Object obj) {
        m10342d(c18662c, obj, true);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final void m10342d(C18662c c18662c, Object obj, boolean z6) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z6 && charSequence.length() == 0) {
                return;
            }
            m10345h((m10341f(c18662c) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f29274f);
            m10345h(bytes.length);
            this.f29278a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m10342d(c18662c, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m10344g(f29277i, c18662c, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z6 && dDoubleValue == 0.0d) {
                return;
            }
            m10345h((m10341f(c18662c) << 3) | 1);
            this.f29278a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z6 && fFloatValue == 0.0f) {
                return;
            }
            m10345h((m10341f(c18662c) << 3) | 5);
            this.f29278a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z6 && jLongValue == 0) {
                return;
            }
            InterfaceC9735H interfaceC9735H = (InterfaceC9735H) c18662c.m20037a(InterfaceC9735H.class);
            if (interfaceC9735H == null) {
                throw new C18661b("Field has no @Protobuf config");
            }
            m10345h(((C9717E) interfaceC9735H).f29245a << 3);
            m10346i(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            m10343e(c18662c, ((Boolean) obj).booleanValue() ? 1 : 0, z6);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z6 && bArr.length == 0) {
                return;
            }
            m10345h((m10341f(c18662c) << 3) | 2);
            m10345h(bArr.length);
            this.f29278a.write(bArr);
            return;
        }
        InterfaceC18663d interfaceC18663d = (InterfaceC18663d) this.f29279b.get(obj.getClass());
        if (interfaceC18663d != null) {
            m10344g(interfaceC18663d, c18662c, obj, z6);
            return;
        }
        InterfaceC18665f interfaceC18665f = (InterfaceC18665f) this.f29280c.get(obj.getClass());
        if (interfaceC18665f != null) {
            C8013W c8013w = this.f29282e;
            c8013w.f25305b = false;
            c8013w.f25307d = c18662c;
            c8013w.f25306c = z6;
            interfaceC18665f.mo3472a(obj, c8013w);
            return;
        }
        if (obj instanceof InterfaceC9723F) {
            m10343e(c18662c, ((InterfaceC9723F) obj).mo10315a(), true);
        } else if (obj instanceof Enum) {
            m10343e(c18662c, ((Enum) obj).ordinal(), true);
        } else {
            m10344g(this.f29281d, c18662c, obj, z6);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10343e(C18662c c18662c, int i10, boolean z6) {
        if (z6 && i10 == 0) {
            return;
        }
        InterfaceC9735H interfaceC9735H = (InterfaceC9735H) c18662c.m20037a(InterfaceC9735H.class);
        if (interfaceC9735H == null) {
            throw new C18661b("Field has no @Protobuf config");
        }
        m10345h(((C9717E) interfaceC9735H).f29245a << 3);
        m10345h(i10);
    }

    /* JADX INFO: renamed from: g */
    public final void m10344g(InterfaceC18663d interfaceC18663d, C18662c c18662c, Object obj, boolean z6) throws IOException {
        C7960P c7960p = new C7960P(3);
        c7960p.f25202Z = 0L;
        try {
            OutputStream outputStream = this.f29278a;
            this.f29278a = c7960p;
            try {
                interfaceC18663d.mo3472a(obj, this);
                this.f29278a = outputStream;
                long j10 = c7960p.f25202Z;
                c7960p.close();
                if (z6 && j10 == 0) {
                    return;
                }
                m10345h((m10341f(c18662c) << 3) | 2);
                m10346i(j10);
                interfaceC18663d.mo3472a(obj, this);
            } catch (Throwable th2) {
                this.f29278a = outputStream;
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
    public final void m10345h(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f29278a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f29278a.write(i10 & 127);
    }

    /* JADX INFO: renamed from: i */
    public final void m10346i(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f29278a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f29278a.write(((int) j10) & 127);
    }
}
