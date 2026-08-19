package p473T7;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.work.impl.utils.p651oZ.HhJS;
import hm.InterfaceC14537b;
import hm.InterfaceC14538c;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.MediaStreamTrack;
import mm.C17309l;
import mo.AbstractC17329F;
import mo.C17327D;
import mo.C17348o;
import mo.C17352s;
import mo.C17358y;
import mo.InterfaceC17350q;
import p003A1.AbstractC0168G;
import p035B7.C0846c;
import p1113xn.AbstractC21322p;
import p499U9.C7591u;
import p523V9.AbstractC7889G0;
import p542W7.C8437a;
import p542W7.C8439c;
import p592Y7.AbstractC9667b;
import p592Y7.InterfaceC9670e;
import p594Y9.AbstractC9756K2;
import p594Y9.AbstractC9771N;
import p658b5.C11234e;
import p661b7.C11254a;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p765g7.InterfaceC13823a;
import p775h2.AbstractC14376f;
import p804i8.InterfaceC14942a;
import p849k7.C16360m;
import p882m1.clb.WGTYqNchEpHca;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17690x;
import p944p8.C18309a;
import ro.C19261e;

/* JADX INFO: renamed from: T7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7261b extends C8439c {

    /* JADX INFO: renamed from: j */
    public static final Set f23033j = AbstractC17678l.m19293P(new String[]{"text/event-stream", "application/grpc", "application/grpc+proto", "application/grpc+json"});

    /* JADX INFO: renamed from: i */
    public final C7591u f23034i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7261b(LinkedHashMap linkedHashMap, C7591u c7591u, C7591u rumResourceAttributesProvider, C11234e traceSampler, int i10, C8437a localTracerFactory) {
        super(linkedHashMap, c7591u, "rum", traceSampler, i10, localTracerFactory);
        AbstractC16544l.m18094g(rumResourceAttributesProvider, "rumResourceAttributesProvider");
        AbstractC16544l.m18094g(traceSampler, "traceSampler");
        AbstractC14376f.m15825D(i10, "traceContextInjection");
        AbstractC16544l.m18094g(localTracerFactory, "localTracerFactory");
        this.f23034i = rumResourceAttributesProvider;
    }

    @Override // p542W7.C8439c
    /* JADX INFO: renamed from: a */
    public final boolean mo7709a() {
        InterfaceC13823a interfaceC13823aM16583k = this.f26273g.m16583k();
        InterfaceC13823a interfaceC13823a = interfaceC13823aM16583k instanceof InterfaceC13823a ? interfaceC13823aM16583k : null;
        return (interfaceC13823a != null ? interfaceC13823a.mo15458n("rum") : null) == null;
    }

    @Override // p542W7.C8439c
    /* JADX INFO: renamed from: d */
    public final void mo7711d(InterfaceC13823a sdkCore) {
        AbstractC16544l.m18094g(sdkCore, "sdkCore");
        super.mo7711d(sdkCore);
        InterfaceC9670e interfaceC9670eM10254a = AbstractC9667b.m10254a(sdkCore);
        InterfaceC14942a interfaceC14942a = interfaceC9670eM10254a instanceof InterfaceC14942a ? (InterfaceC14942a) interfaceC9670eM10254a : null;
        if (interfaceC14942a != null) {
            interfaceC14942a.mo16108j();
        }
    }

    @Override // p542W7.C8439c
    /* JADX INFO: renamed from: c */
    public final void mo7710c(InterfaceC13823a interfaceC13823a, C17358y request, InterfaceC14537b interfaceC14537b, C17327D c17327d, Throwable th2) {
        int i10;
        int i11;
        Map mapM19244f;
        Long l4;
        Long lValueOf;
        String str;
        C17352s c17352sMo18990e;
        AbstractC16544l.m18094g(request, "request");
        if (interfaceC13823a.mo15458n("rum") != null) {
            C17690x c17690x = C17690x.f56481Y;
            C7591u c7591u = this.f23034i;
            if (c17327d == null) {
                Throwable illegalStateException = th2 == null ? new IllegalStateException("The request ended with no response nor any exception.") : th2;
                C18309a c18309aM10377a = AbstractC9771N.m10377a(request, false);
                String str2 = request.f55379a.f55294i;
                InterfaceC9670e interfaceC9670eM10254a = AbstractC9667b.m10254a(interfaceC13823a);
                InterfaceC14942a interfaceC14942a = interfaceC9670eM10254a instanceof InterfaceC14942a ? (InterfaceC14942a) interfaceC9670eM10254a : null;
                if (interfaceC14942a != null) {
                    String str3 = String.format(Locale.US, "OkHttp request error %s %s", Arrays.copyOf(new Object[]{request.f55380b, str2}, 2));
                    c7591u.getClass();
                    interfaceC14942a.mo16104f(c18309aM10377a, str3, illegalStateException);
                    return;
                }
                return;
            }
            boolean z6 = interfaceC14537b != null;
            C18309a c18309aM10377a2 = AbstractC9771N.m10377a(request, false);
            C17348o c17348o = c17327d.f55178r0;
            String strM19012f = c17348o.m19012f(SIPHeaderNames.CONTENT_TYPE);
            if (strM19012f == null) {
                strM19012f = null;
            }
            if (strM19012f == null) {
                i11 = 5;
            } else {
                String strM21705m0 = AbstractC21322p.m21705m0(strM19012f, '/');
                Locale locale = Locale.US;
                String strM534w = AbstractC0168G.m534w(locale, "US", strM21705m0, locale, "toLowerCase(...)");
                String lowerCase = AbstractC21322p.m21705m0(AbstractC21322p.m21701i0('/', strM19012f, strM19012f), ';').toLowerCase(locale);
                AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
                if (strM534w.equals("image")) {
                    i10 = 7;
                } else if (strM534w.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || strM534w.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                    i10 = 11;
                } else if (strM534w.equals("font")) {
                    i10 = 9;
                } else if (strM534w.equals("text") && lowerCase.equals("css")) {
                    i10 = 10;
                } else {
                    i10 = (strM534w.equals("text") && lowerCase.equals("javascript")) ? 8 : 5;
                }
                i11 = i10;
            }
            if (!z6 || interfaceC14537b == null) {
                mapM19244f = c17690x;
            } else {
                InterfaceC14538c interfaceC14538cMo3833c = interfaceC14537b.mo3833c();
                AbstractC16544l.m18093f(interfaceC14538cMo3833c, "span.context()");
                mapM19244f = AbstractC17659D.m19244f(new C17309l(HhJS.urgK, AbstractC9756K2.m10357b(interfaceC14538cMo3833c)), new C17309l("_dd.span_id", interfaceC14537b.mo3833c().mo3838a()), new C17309l("_dd.rule_psr", this.f26268b.m12498B()));
            }
            InterfaceC9670e interfaceC9670eM10254a2 = AbstractC9667b.m10254a(interfaceC13823a);
            InterfaceC14942a interfaceC14942a2 = interfaceC9670eM10254a2 instanceof InterfaceC14942a ? (InterfaceC14942a) interfaceC9670eM10254a2 : null;
            if (interfaceC14942a2 != null) {
                Integer numValueOf = Integer.valueOf(c17327d.f55176p0);
                InterfaceC11256c interfaceC11256cMo15463s = interfaceC13823a.mo15463s();
                EnumC11255b enumC11255b = EnumC11255b.f34099Z;
                try {
                    AbstractC17329F abstractC17329F = c17327d.f55179s0;
                    if (abstractC17329F == null || (c17352sMo18990e = abstractC17329F.mo18990e()) == null) {
                        str = null;
                    } else {
                        str = c17352sMo18990e.f55299b + Separators.SLASH + c17352sMo18990e.f55300c;
                    }
                    boolean zM19333J = AbstractC17680n.m19333J(f23033j, str);
                    String strM19012f2 = c17348o.m19012f("Sec-WebSocket-Accept");
                    if (strM19012f2 == null) {
                        strM19012f2 = null;
                    }
                    boolean z10 = strM19012f2 == null || AbstractC21322p.m21681O(strM19012f2);
                    if (abstractC17329F == null || zM19333J || !z10) {
                        l4 = null;
                    } else {
                        long jMo18989a = abstractC17329F.mo18989a();
                        Long lValueOf2 = jMo18989a <= 0 ? null : Long.valueOf(jMo18989a);
                        if (lValueOf2 == null) {
                            long jMo18989a2 = c17327d.m18987k().mo18989a();
                            lValueOf = jMo18989a2 <= 0 ? null : Long.valueOf(jMo18989a2);
                        } else {
                            lValueOf = lValueOf2;
                        }
                        l4 = lValueOf;
                    }
                } catch (IOException e10) {
                    AbstractC7889G0.m8184b(interfaceC11256cMo15463s, 5, enumC11255b, C7260a.f23029Z, e10, false, 48);
                } catch (IllegalArgumentException e11) {
                    AbstractC7889G0.m8185c(interfaceC11256cMo15463s, 5, AbstractC17681o.m19382k(enumC11255b, EnumC11255b.f34100o0), C7260a.f23031p0, e11, 48);
                } catch (IllegalStateException e12) {
                    AbstractC7889G0.m8184b(interfaceC11256cMo15463s, 5, enumC11255b, C7260a.f23030o0, e12, false, 48);
                }
                c7591u.getClass();
                interfaceC14942a2.mo16106h(c18309aM10377a2, numValueOf, l4, i11, AbstractC17659D.m19248j(mapM19244f, c17690x));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    @Override // p542W7.C8439c, mo.InterfaceC17351r
    public final C17327D intercept(InterfaceC17350q interfaceC17350q) {
        InterfaceC11256c interfaceC11256cMo15463s;
        int i10 = 8;
        InterfaceC13823a interfaceC13823aM16583k = this.f26273g.m16583k();
        InterfaceC13823a interfaceC13823a = interfaceC13823aM16583k instanceof InterfaceC13823a ? interfaceC13823aM16583k : null;
        C16360m c16360mMo15458n = interfaceC13823a != null ? interfaceC13823a.mo15458n("rum") : null;
        EnumC11255b enumC11255b = EnumC11255b.f34098Y;
        if (c16360mMo15458n != null) {
            C17358y c17358y = ((C19261e) interfaceC17350q).f61057e;
            String str = c17358y.f55379a.f55294i;
            InterfaceC11256c interfaceC11256cMo15463s2 = interfaceC13823a.mo15463s();
            Locale US = Locale.US;
            AbstractC16544l.m18093f(US, "US");
            String str2 = c17358y.f55380b;
            String upperCase = str2.toUpperCase(US);
            AbstractC16544l.m18093f(upperCase, "toUpperCase(...)");
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (!upperCase.equals(TokenNames.OPTIONS)) {
                        AbstractC7889G0.m8185c(interfaceC11256cMo15463s2, 4, AbstractC17681o.m19382k(enumC11255b, EnumC11255b.f34100o0), new C0846c(str2, 9), null, 56);
                        i10 = 2;
                    }
                    break;
                case 70454:
                    if (!upperCase.equals("GET")) {
                        AbstractC7889G0.m8185c(interfaceC11256cMo15463s2, 4, AbstractC17681o.m19382k(enumC11255b, EnumC11255b.f34100o0), new C0846c(str2, 9), null, 56);
                    }
                    i10 = 2;
                    break;
                case 79599:
                    if (!upperCase.equals("PUT")) {
                        AbstractC7889G0.m8185c(interfaceC11256cMo15463s2, 4, AbstractC17681o.m19382k(enumC11255b, EnumC11255b.f34100o0), new C0846c(str2, 9), null, 56);
                        i10 = 2;
                    } else {
                        i10 = 4;
                    }
                    break;
                case 2213344:
                    if (!upperCase.equals("HEAD")) {
                        AbstractC7889G0.m8185c(interfaceC11256cMo15463s2, 4, AbstractC17681o.m19382k(enumC11255b, EnumC11255b.f34100o0), new C0846c(str2, 9), null, 56);
                        i10 = 2;
                    } else {
                        i10 = 3;
                    }
                    break;
                case 2461856:
                    if (!upperCase.equals("POST")) {
                        AbstractC7889G0.m8185c(interfaceC11256cMo15463s2, 4, AbstractC17681o.m19382k(enumC11255b, EnumC11255b.f34100o0), new C0846c(str2, 9), null, 56);
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    break;
                case 75900968:
                    if (!upperCase.equals(WGTYqNchEpHca.FvXATBeZ)) {
                        AbstractC7889G0.m8185c(interfaceC11256cMo15463s2, 4, AbstractC17681o.m19382k(enumC11255b, EnumC11255b.f34100o0), new C0846c(str2, 9), null, 56);
                        i10 = 2;
                    } else {
                        i10 = 6;
                    }
                    break;
                case 80083237:
                    if (!upperCase.equals("TRACE")) {
                        AbstractC7889G0.m8185c(interfaceC11256cMo15463s2, 4, AbstractC17681o.m19382k(enumC11255b, EnumC11255b.f34100o0), new C0846c(str2, 9), null, 56);
                        i10 = 2;
                    } else {
                        i10 = 7;
                    }
                    break;
                case 1669334218:
                    if (!upperCase.equals("CONNECT")) {
                        AbstractC7889G0.m8185c(interfaceC11256cMo15463s2, 4, AbstractC17681o.m19382k(enumC11255b, EnumC11255b.f34100o0), new C0846c(str2, 9), null, 56);
                        i10 = 2;
                    } else {
                        i10 = 9;
                    }
                    break;
                case 2012838315:
                    if (!upperCase.equals("DELETE")) {
                        AbstractC7889G0.m8185c(interfaceC11256cMo15463s2, 4, AbstractC17681o.m19382k(enumC11255b, EnumC11255b.f34100o0), new C0846c(str2, 9), null, 56);
                        i10 = 2;
                    } else {
                        i10 = 5;
                    }
                    break;
                default:
                    AbstractC7889G0.m8185c(interfaceC11256cMo15463s2, 4, AbstractC17681o.m19382k(enumC11255b, EnumC11255b.f34100o0), new C0846c(str2, 9), null, 56);
                    i10 = 2;
                    break;
            }
            C18309a c18309aM10377a = AbstractC9771N.m10377a(c17358y, true);
            InterfaceC9670e interfaceC9670eM10254a = AbstractC9667b.m10254a(interfaceC13823a);
            InterfaceC14942a interfaceC14942a = interfaceC9670eM10254a instanceof InterfaceC14942a ? (InterfaceC14942a) interfaceC9670eM10254a : null;
            if (interfaceC14942a != null) {
                interfaceC14942a.mo16103e(c18309aM10377a, i10, str, C17690x.f56481Y);
            }
        } else {
            if (interfaceC13823a == null || (interfaceC11256cMo15463s = interfaceC13823a.mo15463s()) == null) {
                InterfaceC11256c.f34102a.getClass();
                interfaceC11256cMo15463s = C11254a.f34097b;
            }
            AbstractC7889G0.m8184b(interfaceC11256cMo15463s, 3, enumC11255b, new C0846c("Default SDK instance", 8), null, false, 56);
        }
        return super.intercept(interfaceC17350q);
    }
}
