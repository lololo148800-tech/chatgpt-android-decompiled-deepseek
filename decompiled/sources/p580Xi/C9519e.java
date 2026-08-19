package p580Xi;

import bo.AbstractC11516d;
import bo.C11527o;
import com.segment.analytics.kotlin.core.AbstractC12774a;
import com.segment.analytics.kotlin.core.AliasEvent;
import com.segment.analytics.kotlin.core.GroupEvent;
import com.segment.analytics.kotlin.core.IdentifyEvent;
import com.segment.analytics.kotlin.core.ScreenEvent;
import com.segment.analytics.kotlin.core.Settings;
import com.segment.analytics.kotlin.core.TrackEvent;
import com.segment.analytics.kotlin.core.platform.plugins.SegmentSettings;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.C16644c;
import p025An.AbstractC0575H;
import p025An.C0611f0;
import p025An.C0644w;
import p069Cf.C1650i;
import p1114xp.InterfaceC21347r;
import p117Eb.C2392v;
import p153Fn.C2925c;
import p530Vi.C8312h;
import p530Vi.C8317m;
import p554Wi.C8878e;
import p554Wi.C8884k;
import p554Wi.EnumC8881h;
import p554Wi.InterfaceC8882i;
import p626Zi.C10397a;
import p626Zi.C10400d;
import p646aj.AbstractC10628h;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17681o;
import p909nm.C17689w;

/* JADX INFO: renamed from: Xi.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C9519e implements InterfaceC21347r, InterfaceC8882i {

    /* JADX INFO: renamed from: Z */
    public C8312h f28647Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f28648o0;

    /* JADX INFO: renamed from: p0 */
    public C8878e f28649p0;

    /* JADX INFO: renamed from: Y */
    public final C8884k f28646Y = new C8884k();

    /* JADX INFO: renamed from: q0 */
    public List f28650q0 = C17689w.f56480Y;

    /* JADX INFO: renamed from: r0 */
    public final String f28651r0 = "Segment.io";

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: a */
    public final AbstractC12774a mo7802a(AbstractC12774a abstractC12774a) {
        AbstractC12774a abstractC12774a2;
        Boolean boolM10999a = AbstractC10628h.m10999a(this.f28651r0, abstractC12774a.mo14508e());
        boolean zBooleanValue = boolM10999a != null ? boolM10999a.booleanValue() : true;
        AbstractC12774a abstractC12774a3 = null;
        if (!this.f28648o0 || !zBooleanValue) {
            return null;
        }
        EnumC8881h enumC8881h = EnumC8881h.f27183Y;
        C8884k c8884k = this.f28646Y;
        AbstractC12774a abstractC12774aM9556c = c8884k.m9556c(EnumC8881h.f27184Z, c8884k.m9556c(enumC8881h, abstractC12774a));
        if (abstractC12774aM9556c != null) {
            if (abstractC12774aM9556c instanceof IdentifyEvent) {
                abstractC12774a2 = (IdentifyEvent) abstractC12774aM9556c;
                m10027e(abstractC12774a2);
            } else if (abstractC12774aM9556c instanceof TrackEvent) {
                abstractC12774a2 = (TrackEvent) abstractC12774aM9556c;
                m10027e(abstractC12774a2);
            } else if (abstractC12774aM9556c instanceof GroupEvent) {
                abstractC12774a2 = (GroupEvent) abstractC12774aM9556c;
                m10027e(abstractC12774a2);
            } else if (abstractC12774aM9556c instanceof ScreenEvent) {
                abstractC12774a2 = (ScreenEvent) abstractC12774aM9556c;
                m10027e(abstractC12774a2);
            } else {
                if (!(abstractC12774aM9556c instanceof AliasEvent)) {
                    throw new C0644w();
                }
                abstractC12774a2 = (AliasEvent) abstractC12774aM9556c;
                m10027e(abstractC12774a2);
            }
            abstractC12774a3 = abstractC12774a2;
        }
        return c8884k.m9556c(EnumC8881h.f27186p0, abstractC12774a3);
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: b */
    public final void mo7803b(Settings settings, int i10) {
        String str;
        C8878e c8878e;
        AbstractC16544l.m18094g(settings, "settings");
        AbstractC14376f.m15825D(i10, "type");
        String key = this.f28651r0;
        AbstractC16544l.m18094g(key, "key");
        this.f28648o0 = settings.f40498a.containsKey(key);
        this.f28646Y.m9555b(new C1650i(settings, i10, 1));
        AbstractC16544l.m18094g(key, "key");
        if (settings.f40498a.containsKey(key)) {
            AbstractC11516d.f34842d.getClass();
            KSerializer kSerializerSerializer = SegmentSettings.INSTANCE.serializer();
            AbstractC16643b abstractC16643b = (AbstractC16643b) settings.f40498a.get(key);
            Object objM12902a = null;
            if (abstractC16643b != null) {
                C11527o c11527o = AbstractC10628h.f31539a;
                C16644c c16644c = abstractC16643b instanceof C16644c ? (C16644c) abstractC16643b : null;
                if (c16644c != null) {
                    objM12902a = AbstractC10628h.f31540b.m12902a(kSerializerSerializer, c16644c);
                }
            }
            SegmentSettings segmentSettings = (SegmentSettings) objM12902a;
            if (segmentSettings == null || (str = segmentSettings.f40516b) == null || (c8878e = this.f28649p0) == null) {
                return;
            }
            c8878e.f27174d = str;
        }
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: c */
    public final C8312h mo7804c() {
        C8312h c8312h = this.f28647Z;
        if (c8312h != null) {
            return c8312h;
        }
        AbstractC16544l.m18103p("analytics");
        throw null;
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: d */
    public final void mo7805d(C8312h c8312h) {
        List listM19382k;
        this.f28647Z = c8312h;
        C8884k c8884k = this.f28646Y;
        c8884k.getClass();
        c8884k.f27193b = c8312h;
        C8317m c8317m = c8312h.f25902Y;
        if (c8317m.f25924j.isEmpty()) {
            int i10 = c8317m.f25922h;
            C10397a c10397a = new C10397a();
            c10397a.f30813a = i10;
            if (i10 < 1) {
                i10 = 20;
            }
            c10397a.f30813a = i10;
            long j10 = ((long) c8317m.f25923i) * 1000;
            C10400d c10400d = new C10400d();
            c10400d.f30819a = j10;
            listM19382k = AbstractC17681o.m19382k(c10397a, c10400d);
        } else {
            listM19382k = c8317m.f25924j;
        }
        this.f28650q0 = listM19382k;
        C9517c c9517c = new C9517c();
        c9517c.f28642o0 = new Settings();
        c9517c.f28641Z = mo7804c();
        c8884k.m9554a(c9517c);
        this.f28649p0 = new C8878e(c8312h, this.f28651r0, c8317m.f25915a, this.f28650q0, c8317m.f25927m);
        C2392v c2392v = c8312h.f25903Z;
        AbstractC0575H.m1156D((C2925c) c2392v.f7437o0, (C0611f0) c2392v.f7438p0, null, new C9518d(c8312h, this, null), 2);
    }

    /* JADX INFO: renamed from: e */
    public final void m10027e(AbstractC12774a abstractC12774a) {
        C8878e c8878e = this.f28649p0;
        if (c8878e != null) {
            c8878e.f27175e.mo2524p(abstractC12774a);
        }
    }

    @Override // p554Wi.InterfaceC8882i
    public final EnumC8881h getType() {
        return EnumC8881h.f27185o0;
    }
}
