package p344Nl;

import java.util.List;
import livekit.LivekitModels$TrackInfo;
import p387Pl.AbstractC6468O;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Nl.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C5839k extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C5842n f19084Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC6468O f19085Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC5826H f19086o0;

    /* JADX INFO: renamed from: p0 */
    public List f19087p0;

    /* JADX INFO: renamed from: q0 */
    public String f19088q0;

    /* JADX INFO: renamed from: r0 */
    public LivekitModels$TrackInfo f19089r0;

    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ Object f19090s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C5842n f19091t0;

    /* JADX INFO: renamed from: u0 */
    public int f19092u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5839k(C5842n c5842n, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f19091t0 = c5842n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f19090s0 = obj;
        this.f19092u0 |= Integer.MIN_VALUE;
        return this.f19091t0.m6251u(null, null, null, null, this);
    }
}
