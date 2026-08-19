package p580Xi;

import bo.AbstractC11523k;
import bo.C11527o;
import com.segment.analytics.kotlin.core.AbstractC12774a;
import com.segment.analytics.kotlin.core.DestinationMetadata;
import com.segment.analytics.kotlin.core.Settings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16642a;
import kotlinx.serialization.json.C16644c;
import om.C18240g;
import p071Ch.C1676g;
import p1155zi.C21891A;
import p1155zi.C22038o;
import p523V9.AbstractC8130l0;
import p530Vi.C8312h;
import p554Wi.C8880g;
import p554Wi.EnumC8881h;
import p554Wi.InterfaceC8882i;
import p594Y9.AbstractC9804S3;
import p646aj.AbstractC10628h;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p948pi.C18418a;

/* JADX INFO: renamed from: Xi.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C9517c implements InterfaceC8882i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f28640Y;

    /* JADX INFO: renamed from: Z */
    public C8312h f28641Z;

    /* JADX INFO: renamed from: o0 */
    public Object f28642o0;

    public /* synthetic */ C9517c() {
        this.f28640Y = 0;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: a */
    public final AbstractC12774a mo7802a(AbstractC12774a abstractC12774a) {
        ArrayList arrayList;
        AbstractC16643b abstractC16643b;
        CopyOnWriteArrayList<InterfaceC8882i> copyOnWriteArrayList;
        C22038o c22038o;
        switch (this.f28640Y) {
            case 0:
                C8880g c8880g = (C8880g) mo7804c().m8933c().f27192a.get(EnumC8881h.f27185o0);
                if (c8880g == null || (copyOnWriteArrayList = c8880g.f27182a) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(copyOnWriteArrayList, 10));
                    for (InterfaceC8882i interfaceC8882i : copyOnWriteArrayList) {
                        AbstractC16544l.m18092e(interfaceC8882i, "null cannot be cast to non-null type com.segment.analytics.kotlin.core.platform.DestinationPlugin");
                        arrayList2.add((C9519e) interfaceC8882i);
                    }
                    arrayList = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        boolean z6 = ((C9519e) it.next()).f28648o0;
                    }
                }
                DestinationMetadata destinationMetadata = new DestinationMetadata();
                C18240g c18240g = new C18240g();
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        c18240g.add(((C9519e) it2.next()).f28651r0);
                    }
                }
                C18240g c18240gM19262b = AbstractC17665J.m19262b(c18240g);
                C18240g c18240g2 = new C18240g();
                for (String str : ((Settings) this.f28642o0).f40498a.f53331Y.keySet()) {
                    if (!AbstractC16544l.m18089b(str, "Segment.io") && !c18240gM19262b.f58127Y.containsKey(str)) {
                        c18240g2.add(str);
                    }
                }
                AbstractC16643b abstractC16643b2 = (AbstractC16643b) ((Settings) this.f28642o0).f40498a.get("Segment.io");
                if (abstractC16643b2 != null) {
                    C11527o c11527o = AbstractC10628h.f31539a;
                    C16644c c16644c = abstractC16643b2 instanceof C16644c ? (C16644c) abstractC16643b2 : null;
                    if (c16644c != null && (abstractC16643b = (AbstractC16643b) c16644c.get("unbundledIntegrations")) != null) {
                        C16642a c16642a = abstractC16643b instanceof C16642a ? (C16642a) abstractC16643b : null;
                        if (c16642a != null) {
                            for (AbstractC16643b abstractC16643b3 : c16642a.f53330Y) {
                                AbstractC16544l.m18092e(abstractC16643b3, "null cannot be cast to non-null type kotlinx.serialization.json.JsonPrimitive");
                                String strMo12922f = ((AbstractC16645d) abstractC16643b3).mo12922f();
                                if (!c18240gM19262b.f58127Y.containsKey(strMo12922f)) {
                                    c18240g2.add(strMo12922f);
                                }
                            }
                        }
                    }
                }
                C18240g c18240gM19262b2 = AbstractC17665J.m19262b(c18240g2);
                destinationMetadata.f40462c = C17689w.f56480Y;
                destinationMetadata.f40460a = AbstractC17680n.m19322C0(c18240gM19262b);
                destinationMetadata.f40461b = AbstractC17680n.m19322C0(c18240gM19262b2);
                AbstractC12774a abstractC12774aM14522b = abstractC12774a.m14522b();
                abstractC12774aM14522b.mo14520q(destinationMetadata);
                return abstractC12774aM14522b;
            case 1:
                AbstractC8130l0.m8649d(abstractC12774a, "device_id", AbstractC11523k.m12910c(((C1676g) this.f28642o0).m2506a()));
                return abstractC12774a;
            default:
                C18418a c18418a = (C18418a) this.f28642o0;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C21891A c21891a = c18418a.f58774b;
                AbstractC16645d element = AbstractC11523k.m12910c(c21891a.m22328g());
                AbstractC16544l.m18094g(element, "element");
                String str2 = (!c21891a.m22331j() || (c22038o = c21891a.f69415a) == null) ? null : c22038o.f69711a;
                AbstractC16645d element2 = AbstractC11523k.m12910c(str2 != null ? str2 : null);
                AbstractC16544l.m18094g(element2, "element");
                AbstractC8130l0.m8649d(abstractC12774a, "user_traits", new C16644c(linkedHashMap));
                return abstractC12774a;
        }
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: b */
    public final void mo7803b(Settings settings, int i10) {
        switch (this.f28640Y) {
            case 0:
                AbstractC16544l.m18094g(settings, "settings");
                AbstractC14376f.m15825D(i10, "type");
                AbstractC9804S3.m10428b(settings, i10);
                this.f28642o0 = settings;
                break;
            case 1:
                AbstractC9804S3.m10428b(settings, i10);
                break;
            default:
                AbstractC9804S3.m10428b(settings, i10);
                break;
        }
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: c */
    public final C8312h mo7804c() {
        switch (this.f28640Y) {
            case 0:
                C8312h c8312h = this.f28641Z;
                if (c8312h != null) {
                    return c8312h;
                }
                AbstractC16544l.m18103p("analytics");
                throw null;
            case 1:
                C8312h c8312h2 = this.f28641Z;
                if (c8312h2 != null) {
                    return c8312h2;
                }
                AbstractC16544l.m18103p("analytics");
                throw null;
            default:
                C8312h c8312h3 = this.f28641Z;
                if (c8312h3 != null) {
                    return c8312h3;
                }
                AbstractC16544l.m18103p("analytics");
                throw null;
        }
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: d */
    public final void mo7805d(C8312h c8312h) {
        switch (this.f28640Y) {
            case 0:
                m10026e(c8312h);
                break;
            case 1:
                m10026e(c8312h);
                break;
            default:
                m10026e(c8312h);
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10026e(C8312h c8312h) {
        switch (this.f28640Y) {
            case 0:
                this.f28641Z = c8312h;
                break;
            case 1:
                this.f28641Z = c8312h;
                break;
            default:
                this.f28641Z = c8312h;
                break;
        }
    }

    @Override // p554Wi.InterfaceC8882i
    public final EnumC8881h getType() {
        switch (this.f28640Y) {
            case 0:
                break;
            case 1:
                break;
        }
        return EnumC8881h.f27184Z;
    }

    public /* synthetic */ C9517c(Object obj, int i10) {
        this.f28640Y = i10;
        this.f28642o0 = obj;
    }
}
