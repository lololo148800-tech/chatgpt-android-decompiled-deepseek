package io.ktor.client.plugins.auth;

import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p582Xk.C9531h;
import p754fl.C13693c;
import p972qm.InterfaceC18770c;
import sl.C19666a;
import sm.AbstractC19694j;
import tl.C20003c;

/* JADX INFO: renamed from: io.ktor.client.plugins.auth.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C15061f extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public C16525B f46797Y;

    /* JADX INFO: renamed from: Z */
    public HashSet f46798Z;

    /* JADX INFO: renamed from: o0 */
    public Object f46799o0;

    /* JADX INFO: renamed from: p0 */
    public int f46800p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ C9531h f46801q0;

    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ C13693c f46802r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ List f46803s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C20003c f46804t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C19666a f46805u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15061f(List list, C20003c c20003c, C19666a c19666a, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f46803s0 = list;
        this.f46804t0 = c20003c;
        this.f46805u0 = c19666a;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C19666a c19666a = this.f46805u0;
        C15061f c15061f = new C15061f(this.f46803s0, this.f46804t0, c19666a, (InterfaceC18770c) obj3);
        c15061f.f46801q0 = (C9531h) obj;
        c15061f.f46802r0 = (C13693c) obj2;
        return c15061f.invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:185:0x0483  */
    /* JADX WARN: Code duplicated, block: B:187:0x0486  */
    /* JADX WARN: Code duplicated, block: B:189:0x049d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:190:0x049e  */
    /* JADX WARN: Code duplicated, block: B:203:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x019e A[EDGE_INSN: B:204:0x019e->B:62:0x019e BREAK  A[LOOP:3: B:45:0x016c->B:63:0x01a0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:29:0x010a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0123  */
    /* JADX WARN: Code duplicated, block: B:40:0x0148  */
    /* JADX WARN: Code duplicated, block: B:42:0x0159  */
    /* JADX WARN: Code duplicated, block: B:44:0x0168  */
    /* JADX WARN: Code duplicated, block: B:47:0x0172  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:190:0x049e -> B:191:0x04a1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:76:0x01ec
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.auth.C15061f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
