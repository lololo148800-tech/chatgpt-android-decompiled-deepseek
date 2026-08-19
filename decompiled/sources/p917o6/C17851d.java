package p917o6;

import java.util.AbstractList;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import p942p6.EnumC18300d;

/* JADX INFO: renamed from: o6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C17851d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17842J f56911a;

    /* JADX INFO: renamed from: b */
    public UUID f56912b;

    /* JADX INFO: renamed from: c */
    public InterfaceC17835C f56913c = C17870w.f56967a;

    /* JADX INFO: renamed from: d */
    public EnumC18300d f56914d;

    /* JADX INFO: renamed from: e */
    public AbstractList f56915e;

    /* JADX INFO: renamed from: f */
    public Boolean f56916f;

    /* JADX INFO: renamed from: g */
    public Boolean f56917g;

    /* JADX INFO: renamed from: h */
    public Boolean f56918h;

    /* JADX INFO: renamed from: i */
    public Boolean f56919i;

    /* JADX INFO: renamed from: j */
    public Boolean f56920j;

    public C17851d(InterfaceC17842J interfaceC17842J) {
        this.f56911a = interfaceC17842J;
    }

    /* JADX INFO: renamed from: a */
    public final C17852e m19596a() {
        UUID uuidRandomUUID = this.f56912b;
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
            AbstractC16544l.m18093f(uuidRandomUUID, "randomUUID(...)");
        }
        InterfaceC17835C interfaceC17835C = this.f56913c;
        EnumC18300d enumC18300d = this.f56914d;
        AbstractList abstractList = this.f56915e;
        Boolean bool = this.f56917g;
        Boolean bool2 = this.f56918h;
        Boolean bool3 = this.f56916f;
        Boolean bool4 = this.f56919i;
        Boolean bool5 = this.f56920j;
        return new C17852e(this.f56911a, uuidRandomUUID, interfaceC17835C, enumC18300d, abstractList, bool, bool2, bool3, bool4, bool5);
    }
}
