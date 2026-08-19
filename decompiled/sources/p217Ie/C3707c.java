package p217Ie;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1155zi.C21984a1;
import p381Pe.C6397h;
import p479Td.C7351f0;

/* JADX INFO: renamed from: Ie.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3707c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f11244Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7351f0 f11245Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3707c(int i10, C7351f0 c7351f0) {
        super(1);
        this.f11244Y = i10;
        this.f11245Z = c7351f0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f11244Y) {
            case 0:
                C6397h it = (C6397h) obj;
                AbstractC16544l.m18094g(it, "it");
                return Boolean.valueOf(AbstractC16544l.m18089b(((C21984a1) it.f20819a).f69607Y, this.f11245Z.f23286a));
            case 1:
                C6397h it2 = (C6397h) obj;
                AbstractC16544l.m18094g(it2, "it");
                return Boolean.valueOf(AbstractC16544l.m18089b(((C21984a1) it2.f20819a).f69607Y, this.f11245Z.f23286a));
            default:
                C6397h it3 = (C6397h) obj;
                AbstractC16544l.m18094g(it3, "it");
                return Boolean.valueOf(AbstractC16544l.m18089b(((C7351f0) it3.f20822d).f23286a, this.f11245Z.f23286a));
        }
    }
}
