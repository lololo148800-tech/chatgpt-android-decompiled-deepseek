package co;

import bo.C11521i;
import bo.C11528p;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16642a;
import kotlinx.serialization.json.C16644c;
import kotlinx.serialization.json.JsonNull;
import mm.AbstractC17298a;
import mm.C17296C;
import mm.C17299b;
import mo.C17340g;
import mo.C17341h;
import mo.C17342i;
import mo.C17343j;
import no.AbstractC17708b;
import p372P3.AbstractC6327i;
import p571X9.AbstractC9233X;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import pm.C18513a;
import sm.AbstractC19685a;

/* JADX INFO: renamed from: co.B */
/* JADX INFO: loaded from: classes2.dex */
public final class C11801B {

    /* JADX INFO: renamed from: a */
    public int f35770a;

    /* JADX INFO: renamed from: b */
    public boolean f35771b;

    /* JADX INFO: renamed from: c */
    public boolean f35772c;

    /* JADX INFO: renamed from: d */
    public final Object f35773d;

    public C11801B(C11521i c11521i, AbstractC6327i abstractC6327i) {
        this.f35773d = abstractC6327i;
        this.f35771b = c11521i.f34871c;
        this.f35772c = c11521i.f34883o;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00af  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m13063a(C11801B c11801b, C17299b c17299b, AbstractC19685a abstractC19685a) {
        C11800A c11800a;
        byte bM6923g;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        C11801B c11801b2;
        byte bMo6922f;
        AbstractC6327i abstractC6327i;
        c11801b.getClass();
        if (abstractC19685a instanceof C11800A) {
            c11800a = (C11800A) abstractC19685a;
            int i10 = c11800a.f35769s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11800a.f35769s0 = i10 - Integer.MIN_VALUE;
            } else {
                c11800a = new C11800A(c11801b, abstractC19685a);
            }
        } else {
            c11800a = new C11800A(c11801b, abstractC19685a);
        }
        Object obj = c11800a.f35767q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11800a.f35769s0;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = c11800a.f35766p0;
            linkedHashMap2 = c11800a.f35765o0;
            c11801b2 = c11800a.f35764Z;
            C17299b c17299b2 = c11800a.f35763Y;
            AbstractC9233X.m9807c(obj);
            linkedHashMap2.put(str, (AbstractC16643b) obj);
            bMo6922f = ((AbstractC6327i) c11801b2.f35773d).mo6922f();
            if (bMo6922f == 4) {
                linkedHashMap = linkedHashMap2;
                c17299b = c17299b2;
                bM6923g = bMo6922f;
                c11801b = c11801b2;
            } else if (bMo6922f != 7) {
                AbstractC6327i.m6908r((AbstractC6327i) c11801b2.f35773d, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            abstractC6327i = (AbstractC6327i) c11801b2.f35773d;
            if (bMo6922f == 6) {
                abstractC6327i.m6923g((byte) 7);
            } else if (bMo6922f == 4) {
                if (c11801b2.f35772c) {
                    AbstractC11828r.m13112r(abstractC6327i, "object");
                    throw null;
                }
                abstractC6327i.m6923g((byte) 7);
            }
            return new C16644c(linkedHashMap2);
        }
        AbstractC9233X.m9807c(obj);
        AbstractC6327i abstractC6327i2 = (AbstractC6327i) c11801b.f35773d;
        bM6923g = abstractC6327i2.m6923g((byte) 6);
        if (abstractC6327i2.mo6939y() == 4) {
            AbstractC6327i.m6908r(abstractC6327i2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        AbstractC6327i abstractC6327i3 = (AbstractC6327i) c11801b.f35773d;
        if (abstractC6327i3.mo6919c()) {
            String strM6928l = c11801b.f35771b ? abstractC6327i3.m6928l() : abstractC6327i3.m6926j();
            abstractC6327i3.m6923g((byte) 5);
            c11800a.f35763Y = c17299b;
            c11800a.f35764Z = c11801b;
            c11800a.f35765o0 = linkedHashMap;
            c11800a.f35766p0 = strM6928l;
            c11800a.f35769s0 = 1;
            c17299b.getClass();
            c17299b.f55124Z = c11800a;
            return enumC19250a;
        }
        linkedHashMap2 = linkedHashMap;
        byte b = bM6923g;
        c11801b2 = c11801b;
        bMo6922f = b;
        abstractC6327i = (AbstractC6327i) c11801b2.f35773d;
        if (bMo6922f == 6) {
            abstractC6327i.m6923g((byte) 7);
        } else if (bMo6922f == 4) {
            if (c11801b2.f35772c) {
                AbstractC11828r.m13112r(abstractC6327i, "object");
                throw null;
            }
            abstractC6327i.m6923g((byte) 7);
        }
        return new C16644c(linkedHashMap2);
    }

    /* JADX INFO: renamed from: b */
    public C17343j m13064b(SSLSocket sSLSocket) throws UnknownServiceException {
        C17343j c17343j;
        int i10;
        boolean z6;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        int i11 = this.f35770a;
        List list = (List) this.f35773d;
        int size = list.size();
        while (true) {
            if (i11 >= size) {
                c17343j = null;
                break;
            }
            c17343j = (C17343j) list.get(i11);
            if (c17343j.m19008b(sSLSocket)) {
                this.f35770a = i11 + 1;
                break;
            }
            i11++;
        }
        if (c17343j == null) {
            StringBuilder sb2 = new StringBuilder(MMVKXkcLpuHFDi.DkkvptCCWrqJj);
            sb2.append(this.f35772c);
            sb2.append(", modes=");
            sb2.append(list);
            sb2.append(", supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            AbstractC16544l.m18091d(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            AbstractC16544l.m18093f(string, "toString(this)");
            sb2.append(string);
            throw new UnknownServiceException(sb2.toString());
        }
        int i12 = this.f35770a;
        int size2 = list.size();
        while (true) {
            i10 = 0;
            if (i12 >= size2) {
                z6 = false;
                break;
            }
            if (((C17343j) list.get(i12)).m19008b(sSLSocket)) {
                z6 = true;
                break;
            }
            i12++;
        }
        this.f35771b = z6;
        boolean z10 = this.f35772c;
        String[] strArr = c17343j.f55261c;
        if (strArr != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            AbstractC16544l.m18093f(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = AbstractC17708b.m19425q(enabledCipherSuites, strArr, C17341h.f55233c);
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = c17343j.f55262d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            AbstractC16544l.m18093f(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = AbstractC17708b.m19425q(enabledProtocols2, strArr2, C18513a.f58995Z);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC16544l.m18093f(supportedCipherSuites, "supportedCipherSuites");
        C17340g c17340g = C17341h.f55233c;
        byte[] bArr = AbstractC17708b.f56536a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (c17340g.compare(supportedCipherSuites[i10], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i10++;
        }
        if (z10 && i10 != -1) {
            AbstractC16544l.m18093f(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i10];
            AbstractC16544l.m18093f(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) objArrCopyOf;
            cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = str;
        }
        C17342i c17342i = new C17342i(c17343j);
        AbstractC16544l.m18093f(cipherSuitesIntersection, "cipherSuitesIntersection");
        c17342i.m19003c((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        AbstractC16544l.m18093f(tlsVersionsIntersection, "tlsVersionsIntersection");
        c17342i.m19005e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        C17343j c17343jM19001a = c17342i.m19001a();
        if (c17343jM19001a.m19009c() != null) {
            sSLSocket.setEnabledProtocols(c17343jM19001a.f55262d);
        }
        if (c17343jM19001a.m19007a() != null) {
            sSLSocket.setEnabledCipherSuites(c17343jM19001a.f55261c);
        }
        return c17343j;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC16643b m13065c() {
        AbstractC16643b c16644c;
        Object obj;
        AbstractC6327i abstractC6327i = (AbstractC6327i) this.f35773d;
        byte bMo6939y = abstractC6327i.mo6939y();
        if (bMo6939y == 1) {
            return m13067e(true);
        }
        if (bMo6939y == 0) {
            return m13067e(false);
        }
        if (bMo6939y != 6) {
            if (bMo6939y == 8) {
                return m13066d();
            }
            AbstractC6327i.m6908r(abstractC6327i, "Cannot read Json element because of unexpected ".concat(AbstractC11828r.m13119y(bMo6939y)), 0, null, 6);
            throw null;
        }
        int i10 = this.f35770a + 1;
        this.f35770a = i10;
        if (i10 == 200) {
            C11836z c11836z = new C11836z(this, null);
            EnumC19250a enumC19250a = AbstractC17298a.f55122a;
            C17299b c17299b = new C17299b();
            c17299b.f55123Y = c11836z;
            c17299b.f55124Z = c17299b;
            EnumC19250a enumC19250a2 = AbstractC17298a.f55122a;
            c17299b.f55125o0 = enumC19250a2;
            while (true) {
                obj = c17299b.f55125o0;
                InterfaceC18770c interfaceC18770c = c17299b.f55124Z;
                if (interfaceC18770c == null) {
                    break;
                }
                if (AbstractC16544l.m18089b(enumC19250a2, obj)) {
                    try {
                        C11836z c11836z2 = c17299b.f55123Y;
                        C17296C c17296c = C17296C.f55119a;
                        AbstractC16529F.m18081e(3, c11836z2);
                        Object objInvoke = c11836z2.invoke(c17299b, c17296c, interfaceC18770c);
                        if (objInvoke != EnumC19250a.f61036Y) {
                            interfaceC18770c.resumeWith(objInvoke);
                        }
                    } catch (Throwable th2) {
                        interfaceC18770c.resumeWith(AbstractC9233X.m9806b(th2));
                    }
                } else {
                    c17299b.f55125o0 = enumC19250a2;
                    interfaceC18770c.resumeWith(obj);
                }
            }
            AbstractC9233X.m9807c(obj);
            c16644c = (AbstractC16643b) obj;
        } else {
            byte bM6923g = abstractC6327i.m6923g((byte) 6);
            if (abstractC6327i.mo6939y() == 4) {
                AbstractC6327i.m6908r(abstractC6327i, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (abstractC6327i.mo6919c()) {
                String strM6928l = this.f35771b ? abstractC6327i.m6928l() : abstractC6327i.m6926j();
                abstractC6327i.m6923g((byte) 5);
                linkedHashMap.put(strM6928l, m13065c());
                bM6923g = abstractC6327i.mo6922f();
                if (bM6923g != 4) {
                    if (bM6923g == 7) {
                        break;
                    }
                    AbstractC6327i.m6908r(abstractC6327i, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bM6923g == 6) {
                abstractC6327i.m6923g((byte) 7);
            } else if (bM6923g == 4) {
                if (!this.f35772c) {
                    AbstractC11828r.m13112r(abstractC6327i, "object");
                    throw null;
                }
                abstractC6327i.m6923g((byte) 7);
            }
            c16644c = new C16644c(linkedHashMap);
        }
        this.f35770a--;
        return c16644c;
    }

    /* JADX INFO: renamed from: d */
    public C16642a m13066d() {
        AbstractC6327i abstractC6327i = (AbstractC6327i) this.f35773d;
        byte bMo6922f = abstractC6327i.mo6922f();
        if (abstractC6327i.mo6939y() == 4) {
            AbstractC6327i.m6908r(abstractC6327i, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (abstractC6327i.mo6919c()) {
            arrayList.add(m13065c());
            bMo6922f = abstractC6327i.mo6922f();
            if (bMo6922f != 4) {
                boolean z6 = bMo6922f == 9;
                int i10 = abstractC6327i.f20528b;
                if (!z6) {
                    AbstractC6327i.m6908r(abstractC6327i, "Expected end of the array or comma", i10, null, 4);
                    throw null;
                }
            }
        }
        if (bMo6922f == 8) {
            abstractC6327i.m6923g((byte) 9);
        } else if (bMo6922f == 4) {
            if (!this.f35772c) {
                AbstractC11828r.m13112r(abstractC6327i, "array");
                throw null;
            }
            abstractC6327i.m6923g((byte) 9);
        }
        return new C16642a(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public AbstractC16645d m13067e(boolean z6) {
        AbstractC6327i abstractC6327i = (AbstractC6327i) this.f35773d;
        String strM6928l = (this.f35771b || !z6) ? abstractC6327i.m6928l() : abstractC6327i.m6926j();
        return (z6 || !AbstractC16544l.m18089b(strM6928l, "null")) ? new C11528p(strM6928l, z6, null) : JsonNull.INSTANCE;
    }

    public C11801B(List connectionSpecs) {
        AbstractC16544l.m18094g(connectionSpecs, "connectionSpecs");
        this.f35773d = connectionSpecs;
    }
}
