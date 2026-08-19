package p544W9;

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
import p571X9.AbstractC9306j0;
import p961qb.C18661b;
import p961qb.C18662c;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;
import p961qb.InterfaceC18665f;

/* JADX INFO: renamed from: W9.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8628f implements InterfaceC18664e {

    /* JADX INFO: renamed from: f */
    public static final Charset f26465f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final C18662c f26466g = new C18662c(SubscriberAttributeKt.JSON_NAME_KEY, AbstractC9306j0.m9899r(AbstractC3794B0.m4467B(InterfaceC8616d.class, new C8598a(1))));

    /* JADX INFO: renamed from: h */
    public static final C18662c f26467h = new C18662c("value", AbstractC9306j0.m9899r(AbstractC3794B0.m4467B(InterfaceC8616d.class, new C8598a(2))));

    /* JADX INFO: renamed from: i */
    public static final C8622e f26468i = C8622e.f26456b;

    /* JADX INFO: renamed from: a */
    public OutputStream f26469a;

    /* JADX INFO: renamed from: b */
    public final HashMap f26470b;

    /* JADX INFO: renamed from: c */
    public final HashMap f26471c;

    /* JADX INFO: renamed from: d */
    public final C8622e f26472d;

    /* JADX INFO: renamed from: e */
    public final C8013W f26473e = new C8013W(this, 1);

    public C8628f(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, C8622e c8622e) {
        this.f26469a = byteArrayOutputStream;
        this.f26470b = map;
        this.f26471c = map2;
        this.f26472d = c8622e;
    }

    /* JADX INFO: renamed from: f */
    public static int m9279f(C18662c c18662c) {
        InterfaceC8616d interfaceC8616d = (InterfaceC8616d) c18662c.m20037a(InterfaceC8616d.class);
        if (interfaceC8616d != null) {
            return ((C8598a) interfaceC8616d).f26425a;
        }
        throw new C18661b("Field has no @Protobuf config");
    }

    @Override // p961qb.InterfaceC18664e
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC18664e mo8314a(C18662c c18662c, int i10) {
        m9281e(c18662c, i10, true);
        return this;
    }

    @Override // p961qb.InterfaceC18664e
    /* JADX INFO: renamed from: b */
    public final InterfaceC18664e mo8315b(C18662c c18662c, long j10) throws IOException {
        if (j10 != 0) {
            InterfaceC8616d interfaceC8616d = (InterfaceC8616d) c18662c.m20037a(InterfaceC8616d.class);
            if (interfaceC8616d == null) {
                throw new C18661b("Field has no @Protobuf config");
            }
            m9283h(((C8598a) interfaceC8616d).f26425a << 3);
            m9284i(j10);
        }
        return this;
    }

    @Override // p961qb.InterfaceC18664e
    /* JADX INFO: renamed from: c */
    public final InterfaceC18664e mo8316c(C18662c c18662c, Object obj) {
        m9280d(c18662c, obj, true);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final void m9280d(C18662c c18662c, Object obj, boolean z6) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z6 && charSequence.length() == 0) {
                return;
            }
            m9283h((m9279f(c18662c) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f26465f);
            m9283h(bytes.length);
            this.f26469a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m9280d(c18662c, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m9282g(f26468i, c18662c, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z6 && dDoubleValue == 0.0d) {
                return;
            }
            m9283h((m9279f(c18662c) << 3) | 1);
            this.f26469a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z6 && fFloatValue == 0.0f) {
                return;
            }
            m9283h((m9279f(c18662c) << 3) | 5);
            this.f26469a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z6 && jLongValue == 0) {
                return;
            }
            InterfaceC8616d interfaceC8616d = (InterfaceC8616d) c18662c.m20037a(InterfaceC8616d.class);
            if (interfaceC8616d == null) {
                throw new C18661b("Field has no @Protobuf config");
            }
            m9283h(((C8598a) interfaceC8616d).f26425a << 3);
            m9284i(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            m9281e(c18662c, ((Boolean) obj).booleanValue() ? 1 : 0, z6);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z6 && bArr.length == 0) {
                return;
            }
            m9283h((m9279f(c18662c) << 3) | 2);
            m9283h(bArr.length);
            this.f26469a.write(bArr);
            return;
        }
        InterfaceC18663d interfaceC18663d = (InterfaceC18663d) this.f26470b.get(obj.getClass());
        if (interfaceC18663d != null) {
            m9282g(interfaceC18663d, c18662c, obj, z6);
            return;
        }
        InterfaceC18665f interfaceC18665f = (InterfaceC18665f) this.f26471c.get(obj.getClass());
        if (interfaceC18665f != null) {
            C8013W c8013w = this.f26473e;
            c8013w.f25305b = false;
            c8013w.f25307d = c18662c;
            c8013w.f25306c = z6;
            interfaceC18665f.mo3472a(obj, c8013w);
            return;
        }
        if (obj instanceof InterfaceC8604b) {
            m9281e(c18662c, ((InterfaceC8604b) obj).mo9258a(), true);
        } else if (obj instanceof Enum) {
            m9281e(c18662c, ((Enum) obj).ordinal(), true);
        } else {
            m9282g(this.f26472d, c18662c, obj, z6);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9281e(C18662c c18662c, int i10, boolean z6) {
        if (z6 && i10 == 0) {
            return;
        }
        InterfaceC8616d interfaceC8616d = (InterfaceC8616d) c18662c.m20037a(InterfaceC8616d.class);
        if (interfaceC8616d == null) {
            throw new C18661b("Field has no @Protobuf config");
        }
        m9283h(((C8598a) interfaceC8616d).f26425a << 3);
        m9283h(i10);
    }

    /* JADX INFO: renamed from: g */
    public final void m9282g(InterfaceC18663d interfaceC18663d, C18662c c18662c, Object obj, boolean z6) throws IOException {
        C7960P c7960p = new C7960P(1);
        c7960p.f25202Z = 0L;
        try {
            OutputStream outputStream = this.f26469a;
            this.f26469a = c7960p;
            try {
                interfaceC18663d.mo3472a(obj, this);
                this.f26469a = outputStream;
                long j10 = c7960p.f25202Z;
                c7960p.close();
                if (z6 && j10 == 0) {
                    return;
                }
                m9283h((m9279f(c18662c) << 3) | 2);
                m9284i(j10);
                interfaceC18663d.mo3472a(obj, this);
            } catch (Throwable th2) {
                this.f26469a = outputStream;
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
    public final void m9283h(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f26469a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f26469a.write(i10 & 127);
    }

    /* JADX INFO: renamed from: i */
    public final void m9284i(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f26469a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f26469a.write(((int) j10) & 127);
    }
}
