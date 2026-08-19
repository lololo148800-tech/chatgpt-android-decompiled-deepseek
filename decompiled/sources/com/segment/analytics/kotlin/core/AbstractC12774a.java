package com.segment.analytics.kotlin.core;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.C16644c;
import mm.C17296C;
import p025An.C0644w;
import p1071w0.AbstractC20734X;
import p1113xn.AbstractC21322p;
import p1114xp.C21346q;
import p225Im.InterfaceC3756d;
import p530Vi.AbstractC8320p;
import p530Vi.C8304L;
import p530Vi.C8316l;
import p530Vi.EnumC8319o;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: com.segment.analytics.kotlin.core.a */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C12775b.class)
public abstract class AbstractC12774a {
    public static final BaseEvent$Companion Companion = new BaseEvent$Companion();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m14521a(C21346q c21346q, AbstractC19687c abstractC19687c) {
        C8316l c8316l;
        AbstractC12774a abstractC12774a;
        if (abstractC19687c instanceof C8316l) {
            c8316l = (C8316l) abstractC19687c;
            int i10 = c8316l.f25914p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c8316l.f25914p0 = i10 - Integer.MIN_VALUE;
            } else {
                c8316l = new C8316l(this, abstractC19687c);
            }
        } else {
            c8316l = new C8316l(this, abstractC19687c);
        }
        Object objM21739a = c8316l.f25912Z;
        Object obj = EnumC19250a.f61036Y;
        int i11 = c8316l.f25914p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM21739a);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C8304L.class);
            c8316l.f25911Y = this;
            c8316l.f25914p0 = 1;
            objM21739a = c21346q.m21739a(interfaceC3756dMo5693b, c8316l);
            if (objM21739a == obj) {
                return obj;
            }
            abstractC12774a = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC12774a = c8316l.f25911Y;
            AbstractC9233X.m9807c(objM21739a);
        }
        C8304L c8304l = (C8304L) objM21739a;
        C17296C c17296c = C17296C.f55119a;
        if (c8304l == null) {
            return c17296c;
        }
        abstractC12774a.mo14514k(c8304l.f25878a);
        abstractC12774a.mo14516m(AbstractC8320p.f25941a);
        if (AbstractC21322p.m21681O(abstractC12774a.getF40511h())) {
            String str = c8304l.f25879b;
            if (str == null) {
                str = "";
            }
            abstractC12774a.mo14519p(str);
        }
        return c17296c;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC12774a m14522b() {
        AbstractC12774a trackEvent;
        if (this instanceof AliasEvent) {
            String userId = ((AliasEvent) this).f40451a;
            AbstractC16544l.m18094g(userId, "userId");
            String previousId = ((AliasEvent) this).f40452b;
            AbstractC16544l.m18094g(previousId, "previousId");
            AliasEvent aliasEvent = new AliasEvent();
            aliasEvent.f40451a = userId;
            aliasEvent.f40452b = previousId;
            aliasEvent.f40453c = EnumC8319o.f25937p0;
            aliasEvent.f40459i = new DestinationMetadata();
            trackEvent = aliasEvent;
        } else if (this instanceof GroupEvent) {
            GroupEvent groupEvent = (GroupEvent) this;
            String groupId = groupEvent.f40463a;
            AbstractC16544l.m18094g(groupId, "groupId");
            C16644c traits = groupEvent.f40464b;
            AbstractC16544l.m18094g(traits, "traits");
            GroupEvent groupEvent2 = new GroupEvent();
            groupEvent2.f40463a = groupId;
            groupEvent2.f40464b = traits;
            groupEvent2.f40465c = EnumC8319o.f25939r0;
            groupEvent2.f40470h = "";
            groupEvent2.f40471i = new DestinationMetadata();
            trackEvent = groupEvent2;
        } else if (this instanceof IdentifyEvent) {
            trackEvent = new IdentifyEvent(((IdentifyEvent) this).f40473a, ((IdentifyEvent) this).f40474b);
        } else if (this instanceof ScreenEvent) {
            ScreenEvent screenEvent = (ScreenEvent) this;
            trackEvent = new ScreenEvent(screenEvent.f40487a, screenEvent.f40488b, screenEvent.f40489c);
        } else {
            if (!(this instanceof TrackEvent)) {
                throw new C0644w();
            }
            TrackEvent trackEvent2 = (TrackEvent) this;
            trackEvent = new TrackEvent(trackEvent2.f40505b, trackEvent2.f40504a);
        }
        trackEvent.mo14514k(mo14506c());
        trackEvent.mo14517n(mo14509f());
        trackEvent.mo14518o(mo14510g());
        trackEvent.mo14515l(mo14507d());
        trackEvent.mo14516m(mo14508e());
        trackEvent.mo14519p(getF40511h());
        trackEvent.mo14520q(getF40512i());
        return trackEvent;
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo14506c();

    /* JADX INFO: renamed from: d */
    public abstract C16644c mo14507d();

    /* JADX INFO: renamed from: e */
    public abstract C16644c mo14508e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type com.segment.analytics.kotlin.core.BaseEvent");
        AbstractC12774a abstractC12774a = (AbstractC12774a) obj;
        return getF40506c() == abstractC12774a.getF40506c() && mo14506c().equals(abstractC12774a.mo14506c()) && mo14509f().equals(abstractC12774a.mo14509f()) && mo14510g().equals(abstractC12774a.mo14510g()) && mo14507d().equals(abstractC12774a.mo14507d()) && mo14508e().equals(abstractC12774a.mo14508e()) && AbstractC16544l.m18089b(getF40511h(), abstractC12774a.getF40511h()) && AbstractC16544l.m18089b(getF40512i(), abstractC12774a.getF40512i());
    }

    /* JADX INFO: renamed from: f */
    public abstract String mo14509f();

    /* JADX INFO: renamed from: g */
    public abstract String mo14510g();

    /* JADX INFO: renamed from: h */
    public abstract EnumC8319o getF40506c();

    public int hashCode() {
        return getF40512i().hashCode() + ((getF40511h().hashCode() + AbstractC20734X.m21250u(AbstractC20734X.m21250u((mo14510g().hashCode() + ((mo14509f().hashCode() + ((mo14506c().hashCode() + (getF40506c().hashCode() * 31)) * 31)) * 31)) * 31, 31, mo14507d().f53331Y), 31, mo14508e().f53331Y)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public abstract String getF40511h();

    /* JADX INFO: renamed from: j */
    public abstract DestinationMetadata getF40512i();

    /* JADX INFO: renamed from: k */
    public abstract void mo14514k(String str);

    /* JADX INFO: renamed from: l */
    public abstract void mo14515l(C16644c c16644c);

    /* JADX INFO: renamed from: m */
    public abstract void mo14516m(C16644c c16644c);

    /* JADX INFO: renamed from: n */
    public abstract void mo14517n(String str);

    /* JADX INFO: renamed from: o */
    public abstract void mo14518o(String str);

    /* JADX INFO: renamed from: p */
    public abstract void mo14519p(String str);

    /* JADX INFO: renamed from: q */
    public abstract void mo14520q(DestinationMetadata destinationMetadata);
}
