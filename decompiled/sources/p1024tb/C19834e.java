package p1024tb;

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
import sb.C19514a;

/* JADX INFO: renamed from: tb.e */
/* JADX INFO: loaded from: classes.dex */
public final class C19834e implements InterfaceC18664e {

    /* JADX INFO: renamed from: f */
    public static final Charset f62893f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final C18662c f62894g = new C18662c(SubscriberAttributeKt.JSON_NAME_KEY, AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(1))));

    /* JADX INFO: renamed from: h */
    public static final C18662c f62895h = new C18662c("value", AbstractC9306j0.m9899r(AbstractC9306j0.m9898q(InterfaceC19833d.class, new C19830a(2))));

    /* JADX INFO: renamed from: i */
    public static final C19514a f62896i = new C19514a(1);

    /* JADX INFO: renamed from: a */
    public OutputStream f62897a;

    /* JADX INFO: renamed from: b */
    public final HashMap f62898b;

    /* JADX INFO: renamed from: c */
    public final HashMap f62899c;

    /* JADX INFO: renamed from: d */
    public final C19514a f62900d;

    /* JADX INFO: renamed from: e */
    public final C8013W f62901e = new C8013W(this, 4);

    public C19834e(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, C19514a c19514a) {
        this.f62897a = byteArrayOutputStream;
        this.f62898b = map;
        this.f62899c = map2;
        this.f62900d = c19514a;
    }

    /* JADX INFO: renamed from: g */
    public static int m20773g(C18662c c18662c) {
        InterfaceC19833d interfaceC19833d = (InterfaceC19833d) c18662c.m20037a(InterfaceC19833d.class);
        if (interfaceC19833d != null) {
            return ((C19830a) interfaceC19833d).f62890a;
        }
        throw new C18661b("Field has no @Protobuf config");
    }

    @Override // p961qb.InterfaceC18664e
    /* JADX INFO: renamed from: a */
    public final InterfaceC18664e mo8314a(C18662c c18662c, int i10) {
        m20774d(c18662c, i10, true);
        return this;
    }

    @Override // p961qb.InterfaceC18664e
    /* JADX INFO: renamed from: b */
    public final InterfaceC18664e mo8315b(C18662c c18662c, long j10) throws IOException {
        if (j10 != 0) {
            InterfaceC19833d interfaceC19833d = (InterfaceC19833d) c18662c.m20037a(InterfaceC19833d.class);
            if (interfaceC19833d == null) {
                throw new C18661b("Field has no @Protobuf config");
            }
            m20777h(((C19830a) interfaceC19833d).f62890a << 3);
            m20778i(j10);
        }
        return this;
    }

    @Override // p961qb.InterfaceC18664e
    /* JADX INFO: renamed from: c */
    public final InterfaceC18664e mo8316c(C18662c c18662c, Object obj) {
        m20775e(c18662c, obj, true);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final void m20774d(C18662c c18662c, int i10, boolean z6) {
        if (z6 && i10 == 0) {
            return;
        }
        InterfaceC19833d interfaceC19833d = (InterfaceC19833d) c18662c.m20037a(InterfaceC19833d.class);
        if (interfaceC19833d == null) {
            throw new C18661b("Field has no @Protobuf config");
        }
        m20777h(((C19830a) interfaceC19833d).f62890a << 3);
        m20777h(i10);
    }

    /* JADX INFO: renamed from: e */
    public final void m20775e(C18662c c18662c, Object obj, boolean z6) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z6 && charSequence.length() == 0) {
                return;
            }
            m20777h((m20773g(c18662c) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f62893f);
            m20777h(bytes.length);
            this.f62897a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m20775e(c18662c, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m20776f(f62896i, c18662c, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z6 && dDoubleValue == 0.0d) {
                return;
            }
            m20777h((m20773g(c18662c) << 3) | 1);
            this.f62897a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z6 && fFloatValue == 0.0f) {
                return;
            }
            m20777h((m20773g(c18662c) << 3) | 5);
            this.f62897a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z6 && jLongValue == 0) {
                return;
            }
            InterfaceC19833d interfaceC19833d = (InterfaceC19833d) c18662c.m20037a(InterfaceC19833d.class);
            if (interfaceC19833d == null) {
                throw new C18661b("Field has no @Protobuf config");
            }
            m20777h(((C19830a) interfaceC19833d).f62890a << 3);
            m20778i(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            m20774d(c18662c, ((Boolean) obj).booleanValue() ? 1 : 0, z6);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z6 && bArr.length == 0) {
                return;
            }
            m20777h((m20773g(c18662c) << 3) | 2);
            m20777h(bArr.length);
            this.f62897a.write(bArr);
            return;
        }
        InterfaceC18663d interfaceC18663d = (InterfaceC18663d) this.f62898b.get(obj.getClass());
        if (interfaceC18663d != null) {
            m20776f(interfaceC18663d, c18662c, obj, z6);
            return;
        }
        InterfaceC18665f interfaceC18665f = (InterfaceC18665f) this.f62899c.get(obj.getClass());
        if (interfaceC18665f != null) {
            C8013W c8013w = this.f62901e;
            c8013w.f25305b = false;
            c8013w.f25307d = c18662c;
            c8013w.f25306c = z6;
            interfaceC18665f.mo3472a(obj, c8013w);
            return;
        }
        if (obj instanceof InterfaceC19831b) {
            m20774d(c18662c, ((InterfaceC19831b) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            m20774d(c18662c, ((Enum) obj).ordinal(), true);
        } else {
            m20776f(this.f62900d, c18662c, obj, z6);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m20776f(InterfaceC18663d interfaceC18663d, C18662c c18662c, Object obj, boolean z6) throws IOException {
        C7960P c7960p = new C7960P(4);
        c7960p.f25202Z = 0L;
        try {
            OutputStream outputStream = this.f62897a;
            this.f62897a = c7960p;
            try {
                interfaceC18663d.mo3472a(obj, this);
                this.f62897a = outputStream;
                long j10 = c7960p.f25202Z;
                c7960p.close();
                if (z6 && j10 == 0) {
                    return;
                }
                m20777h((m20773g(c18662c) << 3) | 2);
                m20778i(j10);
                interfaceC18663d.mo3472a(obj, this);
            } catch (Throwable th2) {
                this.f62897a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c7960p.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m20777h(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f62897a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f62897a.write(i10 & 127);
    }

    /* JADX INFO: renamed from: i */
    public final void m20778i(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f62897a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f62897a.write(((int) j10) & 127);
    }
}
