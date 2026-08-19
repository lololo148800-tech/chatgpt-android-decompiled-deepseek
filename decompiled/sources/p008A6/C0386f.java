package p008A6;

import android.gov.nist.core.Separators;
import ao.C11163f0;
import ao.C11181o0;
import ao.C11183p0;
import co.C11831u;
import io.ktor.utils.p815io.C15085k;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16531H;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16532I;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.AbstractC16643b;
import mm.C17296C;
import mo.AbstractC17329F;
import mo.C17355v;
import mo.InterfaceC17333J;
import np.InterfaceC17710b;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.C0566C0;
import p025An.C0644w;
import p025An.InterfaceC0595V;
import p033B5.C0819c;
import p049Bm.InterfaceC1436k;
import p059C5.C1601s;
import p1159zo.C22221g;
import p135F5.C2669e;
import p225Im.C3743B;
import p225Im.EnumC3744C;
import p225Im.InterfaceC3777y;
import p409Qk.C6752c;
import p409Qk.C6754e;
import p457Sh.C7135c;
import p474T8.C7268f;
import p509Uk.C7713f;
import p556Wk.AbstractC8889C;
import p556Wk.AbstractC8900N;
import p556Wk.C8922f;
import p556Wk.C8928j;
import p556Wk.C8937s;
import p556Wk.InterfaceC8888B;
import p559Wn.C8969a;
import p559Wn.C8972d;
import p606Yn.C10100a;
import p606Yn.C10106g;
import p606Yn.C10108i;
import p664bc.AbstractC11336c;
import p825j5.C16124a;
import p825j5.InterfaceC16130g;
import p909nm.AbstractC17667a;
import p909nm.AbstractC17672f;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import sl.C19675j;

/* JADX INFO: renamed from: A6.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0386f implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1295Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f1296Z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0386f(InterfaceC1436k interfaceC1436k) {
        this.f1295Y = 12;
        this.f1296Z = (AbstractC16546n) interfaceC1436k;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        String strValueOf;
        switch (this.f1295Y) {
            case 0:
                C16124a cursor = (C16124a) obj;
                C0384d c0384d = (C0384d) this.f1296Z;
                AbstractC16544l.m18094g(cursor, "cursor");
                String strM17679a = cursor.m17679a(0);
                AbstractC16544l.m18091d(strM17679a);
                String strM17679a2 = cursor.m17679a(1);
                AbstractC16544l.m18091d(strM17679a2);
                return c0384d.invoke(strM17679a, strM17679a2);
            case 1:
                C16124a cursor2 = (C16124a) obj;
                C0384d c0384d2 = (C0384d) this.f1296Z;
                AbstractC16544l.m18094g(cursor2, "cursor");
                String strM17679a3 = cursor2.m17679a(0);
                AbstractC16544l.m18091d(strM17679a3);
                String strM17679a4 = cursor2.m17679a(1);
                AbstractC16544l.m18091d(strM17679a4);
                return c0384d2.invoke(strM17679a3, strM17679a4);
            case 2:
                InterfaceC16130g executeQuery = (InterfaceC16130g) obj;
                C0387g this$0 = (C0387g) this.f1296Z;
                AbstractC16544l.m18094g(this$0, "this$0");
                AbstractC16544l.m18094g(executeQuery, "$this$executeQuery");
                executeQuery.mo17682c(0, (String) this$0.f1299p0);
                return C17296C.f55119a;
            case 3:
                InterfaceC16130g executeQuery2 = (InterfaceC16130g) obj;
                C0387g this$1 = (C0387g) this.f1296Z;
                AbstractC16544l.m18094g(this$1, "this$0");
                AbstractC16544l.m18094g(executeQuery2, "$this$executeQuery");
                int i10 = 0;
                for (Object obj2 : (Collection) this$1.f1299p0) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC17681o.m19388q();
                        throw null;
                    }
                    executeQuery2.mo17682c(i10, (String) obj2);
                    i10 = i11;
                }
                return C17296C.f55119a;
            case 4:
                ((C2669e) this.f1296Z).f8204x0 = true;
                return C17296C.f55119a;
            case 5:
                InterfaceC17333J webSocket = (InterfaceC17333J) this.f1296Z;
                AbstractC16544l.m18094g(webSocket, "$webSocket");
                ((C22221g) webSocket).m22406b(1001, null);
                return C17296C.f55119a;
            case 6:
                C6752c scope = (C6752c) obj;
                AbstractC16544l.m18094g(scope, "scope");
                C19675j c19675j = (C19675j) scope.f21675v0.m20647a(AbstractC8889C.f27207a, new C1601s(7));
                LinkedHashMap linkedHashMap = scope.f21677x0.f21682b;
                InterfaceC8888B interfaceC8888B = (InterfaceC8888B) this.f1296Z;
                Object obj3 = linkedHashMap.get(interfaceC8888B.getKey());
                AbstractC16544l.m18091d(obj3);
                Object objMo2503a = interfaceC8888B.mo2503a((InterfaceC1436k) obj3);
                interfaceC8888B.mo2505c(objMo2503a, scope);
                c19675j.m20652f(interfaceC8888B.getKey(), objMo2503a);
                return C17296C.f55119a;
            case 7:
                ((C7713f) this.f1296Z).close();
                return C17296C.f55119a;
            case 8:
                ((Boolean) obj).booleanValue();
                ((C7268f) this.f1296Z).m7730e();
                return C17296C.f55119a;
            case 9:
                C17355v config = (C17355v) obj;
                AbstractC16544l.m18094g(config, "$this$config");
                config.f55318d.add((C7135c) this.f1296Z);
                return C17296C.f55119a;
            case 10:
                C17355v config2 = (C17355v) obj;
                AbstractC16544l.m18094g(config2, "$this$config");
                config2.f55317c.add((C7135c) this.f1296Z);
                return C17296C.f55119a;
            case 11:
                AbstractC17329F abstractC17329F = (AbstractC17329F) this.f1296Z;
                if (abstractC17329F != null) {
                    abstractC17329F.close();
                }
                return C17296C.f55119a;
            case 12:
                C8922f install = (C8922f) obj;
                AbstractC16544l.m18094g(install, "$this$install");
                ((AbstractC16546n) this.f1296Z).invoke(install);
                return C17296C.f55119a;
            case 13:
                C8937s HttpResponseValidator = (C8937s) obj;
                AbstractC16544l.m18094g(HttpResponseValidator, "$this$HttpResponseValidator");
                HttpResponseValidator.f27332c = ((C6754e) this.f1296Z).f21687g;
                HttpResponseValidator.f27330a.add(new C8928j(2, null));
                return C17296C.f55119a;
            case 14:
                Throwable th2 = (Throwable) obj;
                InterfaceC17710b interfaceC17710b = AbstractC8900N.f27241a;
                C0566C0 c0566c0 = (C0566C0) this.f1296Z;
                if (th2 != null) {
                    interfaceC17710b.mo19442g("Cancelling request because engine Job failed with error: " + th2);
                    c0566c0.mo1275e(AbstractC0575H.m1172a("Engine failed", th2));
                } else {
                    interfaceC17710b.mo19442g("Cancelling request because engine Job completed");
                    c0566c0.m1279g0();
                }
                return C17296C.f55119a;
            case 15:
                ((InterfaceC0595V) this.f1296Z).dispose();
                return C17296C.f55119a;
            case 16:
                ((C0564B0) this.f1296Z).mo1275e(null);
                return C17296C.f55119a;
            case 17:
                C10100a buildSerialDescriptor = (C10100a) obj;
                AbstractC16544l.m18094g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                ((C8969a) this.f1296Z).getClass();
                buildSerialDescriptor.f29899b = C17689w.f56480Y;
                return C17296C.f55119a;
            case 18:
                C10100a buildSerialDescriptor2 = (C10100a) obj;
                AbstractC16544l.m18094g(buildSerialDescriptor2, "$this$buildSerialDescriptor");
                C11163f0 c11163f0 = C11181o0.f33828b;
                C17689w c17689w = C17689w.f56480Y;
                buildSerialDescriptor2.m10678a("type", c11163f0, c17689w, false);
                StringBuilder sb2 = new StringBuilder("kotlinx.serialization.Polymorphic<");
                C8972d c8972d = (C8972d) this.f1296Z;
                sb2.append(c8972d.f27406a.mo4448c());
                sb2.append('>');
                buildSerialDescriptor2.m10678a("value", AbstractC11336c.m12774d(sb2.toString(), C10108i.f29933b, new SerialDescriptor[0], new C0383c(24)), c17689w, false);
                List list = c8972d.f27407b;
                AbstractC16544l.m18094g(list, "<set-?>");
                buildSerialDescriptor2.f29899b = list;
                return C17296C.f55119a;
            case 19:
                int iIntValue = ((Integer) obj).intValue();
                StringBuilder sb3 = new StringBuilder();
                C10106g c10106g = (C10106g) this.f1296Z;
                sb3.append(c10106g.f29924f[iIntValue]);
                sb3.append(": ");
                sb3.append(c10106g.f29925g[iIntValue].mo10679a());
                return sb3.toString();
            case 20:
                C10100a buildSerialDescriptor3 = (C10100a) obj;
                AbstractC16544l.m18094g(buildSerialDescriptor3, "$this$buildSerialDescriptor");
                List list2 = (List) ((C8969a) this.f1296Z).f27403c;
                AbstractC16544l.m18094g(list2, "<set-?>");
                buildSerialDescriptor3.f29899b = list2;
                return C17296C.f55119a;
            case 21:
                int iIntValue2 = ((Integer) obj).intValue();
                StringBuilder sb4 = new StringBuilder();
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = (PluginGeneratedSerialDescriptor) this.f1296Z;
                sb4.append(pluginGeneratedSerialDescriptor.f53322e[iIntValue2]);
                sb4.append(": ");
                sb4.append(pluginGeneratedSerialDescriptor.mo10685h(iIntValue2).mo10679a());
                return sb4.toString();
            case 22:
                C10100a buildClassSerialDescriptor = (C10100a) obj;
                AbstractC16544l.m18094g(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                C11183p0 c11183p0 = (C11183p0) this.f1296Z;
                SerialDescriptor descriptor = c11183p0.f33831a.getDescriptor();
                C17689w c17689w2 = C17689w.f56480Y;
                buildClassSerialDescriptor.m10678a("first", descriptor, c17689w2, false);
                buildClassSerialDescriptor.m10678a("second", c11183p0.f33832b.getDescriptor(), c17689w2, false);
                buildClassSerialDescriptor.m10678a("third", c11183p0.f33833c.getDescriptor(), c17689w2, false);
                return C17296C.f55119a;
            case 23:
                AbstractC16643b node = (AbstractC16643b) obj;
                AbstractC16544l.m18094g(node, "node");
                C11831u c11831u = (C11831u) this.f1296Z;
                c11831u.mo13128O((String) AbstractC17680n.m19351a0(c11831u.f35847a), node);
                return C17296C.f55119a;
            case 24:
                AbstractC16643b it = (AbstractC16643b) obj;
                AbstractC16544l.m18094g(it, "it");
                ((C16525B) this.f1296Z).f51262Y = it;
                return C17296C.f55119a;
            case 25:
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    C15085k c15085k = (C15085k) this.f1296Z;
                    if (!c15085k.m16207l()) {
                        c15085k.mo1138b(th3);
                    }
                }
                return C17296C.f55119a;
            case 26:
                ((C0819c) this.f1296Z).invoke();
                return C17296C.f55119a;
            case 27:
                C3743B it2 = (C3743B) obj;
                AbstractC16544l.m18094g(it2, "it");
                ((C16532I) this.f1296Z).getClass();
                EnumC3744C enumC3744C = it2.f11392a;
                if (enumC3744C == null) {
                    return Separators.STAR;
                }
                InterfaceC3777y interfaceC3777y = it2.f11393b;
                C16532I c16532i = interfaceC3777y instanceof C16532I ? (C16532I) interfaceC3777y : null;
                if (c16532i == null || (strValueOf = c16532i.m18085d(true)) == null) {
                    strValueOf = String.valueOf(interfaceC3777y);
                }
                int i12 = AbstractC16531H.f51266a[enumC3744C.ordinal()];
                if (i12 == 1) {
                    return strValueOf;
                }
                if (i12 == 2) {
                    return "in ".concat(strValueOf);
                }
                if (i12 == 3) {
                    return "out ".concat(strValueOf);
                }
                throw new C0644w();
            case 28:
                return obj == ((AbstractC17667a) this.f1296Z) ? "(this Collection)" : String.valueOf(obj);
            default:
                Map.Entry it3 = (Map.Entry) obj;
                AbstractC16544l.m18094g(it3, "it");
                AbstractC17672f abstractC17672f = (AbstractC17672f) this.f1296Z;
                abstractC17672f.getClass();
                StringBuilder sb5 = new StringBuilder();
                Object key = it3.getKey();
                sb5.append(key == abstractC17672f ? "(this Map)" : String.valueOf(key));
                sb5.append('=');
                Object value = it3.getValue();
                sb5.append(value != abstractC17672f ? String.valueOf(value) : "(this Map)");
                return sb5.toString();
        }
    }

    public /* synthetic */ C0386f(Object obj, int i10) {
        this.f1295Y = i10;
        this.f1296Z = obj;
    }
}
