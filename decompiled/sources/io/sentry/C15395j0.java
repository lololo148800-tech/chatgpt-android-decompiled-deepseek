package io.sentry;

import android.gov.nist.core.Separators;
import io.sentry.clientreport.C15334b;
import io.sentry.clientreport.C15335c;
import io.sentry.profilemeasurements.C15419a;
import io.sentry.profilemeasurements.C15420b;
import io.sentry.protocol.C15421A;
import io.sentry.protocol.C15424D;
import io.sentry.protocol.C15425E;
import io.sentry.protocol.C15426F;
import io.sentry.protocol.C15427G;
import io.sentry.protocol.C15428a;
import io.sentry.protocol.C15429b;
import io.sentry.protocol.C15430c;
import io.sentry.protocol.C15431d;
import io.sentry.protocol.C15433f;
import io.sentry.protocol.C15434g;
import io.sentry.protocol.C15435h;
import io.sentry.protocol.C15436i;
import io.sentry.protocol.C15437j;
import io.sentry.protocol.C15438k;
import io.sentry.protocol.C15439l;
import io.sentry.protocol.C15440m;
import io.sentry.protocol.C15441n;
import io.sentry.protocol.C15444q;
import io.sentry.protocol.C15445r;
import io.sentry.protocol.C15446s;
import io.sentry.protocol.C15448u;
import io.sentry.protocol.C15449v;
import io.sentry.protocol.C15450w;
import io.sentry.protocol.C15451x;
import io.sentry.protocol.C15452y;
import io.sentry.protocol.C15453z;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.EnumC15432e;
import io.sentry.rrweb.C15460a;
import io.sentry.rrweb.C15466g;
import io.sentry.rrweb.C15468i;
import io.sentry.rrweb.C15469j;
import io.sentry.rrweb.C15470k;
import io.sentry.rrweb.C15471l;
import io.sentry.rrweb.EnumC15462c;
import io.sentry.vendor.gson.stream.C15515c;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p544W9.AbstractC8483G3;
import p658b5.C11241l;
import p658b5.C11248s;
import p729ej.C13414e;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15395j0 implements InterfaceC15151P {

    /* JADX INFO: renamed from: c */
    public static final Charset f47987c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final C15524y1 f47988a;

    /* JADX INFO: renamed from: b */
    public final HashMap f47989b;

    public C15395j0(C15524y1 c15524y1) {
        this.f47988a = c15524y1;
        HashMap map = new HashMap();
        this.f47989b = map;
        map.put(C15428a.class, new C15334b(4));
        map.put(C15345d.class, new C15324c(0));
        map.put(C15429b.class, new C15334b(5));
        map.put(C15430c.class, new C15334b(6));
        map.put(DebugImage.class, new C15334b(7));
        map.put(C15431d.class, new C15334b(8));
        map.put(C15433f.class, new C15334b(9));
        map.put(EnumC15432e.class, new C15334b(10));
        map.put(C15435h.class, new C15334b(12));
        map.put(C15436i.class, new C15334b(13));
        map.put(C15437j.class, new C15334b(14));
        map.put(C15438k.class, new C15334b(15));
        map.put(C15439l.class, new C15334b(16));
        map.put(C15440m.class, new C15334b(17));
        map.put(C15113C0.class, new C15324c(1));
        map.put(C15116D0.class, new C15324c(2));
        map.put(C15419a.class, new C15334b(2));
        map.put(C15420b.class, new C15334b(3));
        map.put(C15441n.class, new C15334b(18));
        map.put(C15128H0.class, new C15324c(3));
        map.put(C15460a.class, new C15424D(3));
        map.put(EnumC15462c.class, new C15424D(4));
        map.put(C15466g.class, new C15424D(6));
        map.put(C15468i.class, new C15424D(8));
        map.put(C15469j.class, new C15424D(10));
        map.put(C15470k.class, new C15424D(11));
        map.put(C15471l.class, new C15424D(12));
        map.put(C15444q.class, new C15334b(19));
        map.put(C15445r.class, new C15334b(20));
        map.put(C15175X0.class, new C15324c(5));
        map.put(C15326c1.class, new C15324c(6));
        map.put(C15347d1.class, new C15324c(7));
        map.put(C15446s.class, new C15334b(21));
        map.put(EnumC15361h1.class, new C15324c(8));
        map.put(EnumC15375i1.class, new C15324c(9));
        map.put(C15396j1.class, new C15324c(10));
        map.put(C15448u.class, new C15334b(23));
        map.put(C15449v.class, new C15334b(24));
        map.put(C15108A1.class, new C15324c(11));
        map.put(C15450w.class, new C15334b(25));
        map.put(C15451x.class, new C15334b(26));
        map.put(C15452y.class, new C15334b(27));
        map.put(C15155Q0.class, new C15324c(4));
        map.put(C15453z.class, new C15334b(28));
        map.put(C15421A.class, new C15334b(29));
        map.put(C15132I1.class, new C15324c(13));
        map.put(C15138K1.class, new C15324c(14));
        map.put(C15144M1.class, new C15324c(15));
        map.put(EnumC15147N1.class, new C15324c(16));
        map.put(C15425E.class, new C15424D(0));
        map.put(C15434g.class, new C15334b(11));
        map.put(C15173W1.class, new C15324c(19));
        map.put(C15335c.class, new C15334b(0));
        map.put(C15427G.class, new C15424D(2));
        map.put(C15426F.class, new C15424D(1));
    }

    @Override // io.sentry.InterfaceC15151P
    /* JADX INFO: renamed from: a */
    public final String mo16321a(ConcurrentHashMap concurrentHashMap) {
        return m16646g(concurrentHashMap, false);
    }

    @Override // io.sentry.InterfaceC15151P
    /* JADX INFO: renamed from: b */
    public final void mo16322b(C11241l c11241l, OutputStream outputStream) throws IOException {
        C15524y1 c15524y1 = this.f47988a;
        AbstractC8483G3.m9133c(c11241l, "The SentryEnvelope object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f47987c));
        try {
            ((C15175X0) c11241l.f34016Y).serialize(new C11248s(bufferedWriter, c15524y1.getMaxDepth()), c15524y1.getLogger());
            bufferedWriter.write(Separators.RETURN);
            for (C15321b1 c15321b1 : (Collection) c11241l.f34017Z) {
                try {
                    byte[] bArrM16529d = c15321b1.m16529d();
                    c15321b1.f47863a.serialize(new C11248s(bufferedWriter, c15524y1.getMaxDepth()), c15524y1.getLogger());
                    bufferedWriter.write(Separators.RETURN);
                    bufferedWriter.flush();
                    outputStream.write(bArrM16529d);
                    bufferedWriter.write(Separators.RETURN);
                } catch (Exception e10) {
                    c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to create envelope item. Dropping it.", e10);
                }
            }
            bufferedWriter.flush();
        } catch (Throwable th2) {
            bufferedWriter.flush();
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC15151P
    /* JADX INFO: renamed from: c */
    public final Object mo16323c(Reader reader, Class cls) {
        C15524y1 c15524y1 = this.f47988a;
        try {
            C15360h0 c15360h0 = new C15360h0(reader);
            try {
                InterfaceC15176Y interfaceC15176Y = (InterfaceC15176Y) this.f47989b.get(cls);
                if (interfaceC15176Y != null) {
                    Object objCast = cls.cast(interfaceC15176Y.mo16359a(c15360h0, c15524y1.getLogger()));
                    c15360h0.close();
                    return objCast;
                }
                if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
                    c15360h0.close();
                    return null;
                }
                Object objM16600H0 = c15360h0.m16600H0();
                c15360h0.close();
                return objM16600H0;
            } catch (Throwable th2) {
                try {
                    c15360h0.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e10) {
            c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Error when deserializing", e10);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC15151P
    /* JADX INFO: renamed from: d */
    public final C11241l mo16324d(BufferedInputStream bufferedInputStream) {
        C15524y1 c15524y1 = this.f47988a;
        try {
            return c15524y1.getEnvelopeReader().mo16262a(bufferedInputStream);
        } catch (IOException e10) {
            c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Error deserializing envelope.", e10);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC15151P
    /* JADX INFO: renamed from: e */
    public final Object mo16325e(BufferedReader bufferedReader, Class cls, C15324c c15324c) {
        C15524y1 c15524y1 = this.f47988a;
        try {
            C15360h0 c15360h0 = new C15360h0(bufferedReader);
            try {
                if (!Collection.class.isAssignableFrom(cls)) {
                    Object objM16600H0 = c15360h0.m16600H0();
                    c15360h0.close();
                    return objM16600H0;
                }
                if (c15324c == null) {
                    Object objM16600H1 = c15360h0.m16600H0();
                    c15360h0.close();
                    return objM16600H1;
                }
                ArrayList arrayListM16617j0 = c15360h0.m16617j0(c15524y1.getLogger(), c15324c);
                c15360h0.close();
                return arrayListM16617j0;
            } catch (Throwable th2) {
                try {
                    c15360h0.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Error when deserializing", th4);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC15151P
    /* JADX INFO: renamed from: f */
    public final void mo16326f(Object obj, BufferedWriter bufferedWriter) throws IOException {
        AbstractC8483G3.m9133c(obj, "The entity is required.");
        C15524y1 c15524y1 = this.f47988a;
        InterfaceC15127H logger = c15524y1.getLogger();
        EnumC15375i1 enumC15375i1 = EnumC15375i1.DEBUG;
        if (logger.mo16299p(enumC15375i1)) {
            c15524y1.getLogger().mo16298o(enumC15375i1, "Serializing object: %s", m16646g(obj, c15524y1.isEnablePrettySerializationOutput()));
        }
        C11248s c11248s = new C11248s(bufferedWriter, c15524y1.getMaxDepth());
        ((C13414e) c11248s.f34082o0).m14954G(c11248s, c15524y1.getLogger(), obj);
        bufferedWriter.flush();
    }

    /* JADX INFO: renamed from: g */
    public final String m16646g(Object obj, boolean z6) throws IOException {
        StringWriter stringWriter = new StringWriter();
        C15524y1 c15524y1 = this.f47988a;
        C11248s c11248s = new C11248s(stringWriter, c15524y1.getMaxDepth());
        if (z6) {
            C15515c c15515c = (C15515c) c11248s.f34081Z;
            c15515c.getClass();
            c15515c.f48460p0 = Separators.f31990HT;
            c15515c.f48461q0 = ": ";
        }
        ((C13414e) c11248s.f34082o0).m14954G(c11248s, c15524y1.getLogger(), obj);
        return stringWriter.toString();
    }
}
