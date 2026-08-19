package p917o6;

import java.util.AbstractList;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import p942p6.EnumC18300d;

/* JADX INFO: renamed from: o6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C17852e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17842J f56921a;

    /* JADX INFO: renamed from: b */
    public final UUID f56922b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17835C f56923c;

    /* JADX INFO: renamed from: d */
    public final EnumC18300d f56924d;

    /* JADX INFO: renamed from: e */
    public final AbstractList f56925e;

    /* JADX INFO: renamed from: f */
    public final Boolean f56926f;

    /* JADX INFO: renamed from: g */
    public final Boolean f56927g;

    /* JADX INFO: renamed from: h */
    public final Boolean f56928h;

    /* JADX INFO: renamed from: i */
    public final Boolean f56929i;

    /* JADX INFO: renamed from: j */
    public final Boolean f56930j;

    public C17852e(InterfaceC17842J interfaceC17842J, UUID uuid, InterfaceC17835C interfaceC17835C, EnumC18300d enumC18300d, AbstractList abstractList, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.f56921a = interfaceC17842J;
        this.f56922b = uuid;
        this.f56923c = interfaceC17835C;
        this.f56924d = enumC18300d;
        this.f56925e = abstractList;
        this.f56926f = bool;
        this.f56927g = bool2;
        this.f56928h = bool3;
        this.f56929i = bool4;
        this.f56930j = bool5;
    }

    /* JADX INFO: renamed from: a */
    public final C17851d m19597a() {
        C17851d c17851d = new C17851d(this.f56921a);
        c17851d.f56912b = this.f56922b;
        InterfaceC17835C executionContext = this.f56923c;
        AbstractC16544l.m18094g(executionContext, "executionContext");
        c17851d.f56913c = executionContext;
        c17851d.f56914d = this.f56924d;
        c17851d.f56915e = this.f56925e;
        c17851d.f56917g = this.f56926f;
        c17851d.f56918h = this.f56927g;
        c17851d.f56916f = this.f56928h;
        c17851d.f56919i = this.f56929i;
        c17851d.f56920j = this.f56930j;
        return c17851d;
    }
}
