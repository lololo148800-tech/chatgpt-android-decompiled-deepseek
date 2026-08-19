package p355O7;

import io.sentry.C15358g1;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p676c7.C11682a;
import p743f7.InterfaceC13575a;
import p743f7.InterfaceC13576b;
import p909nm.C17689w;

/* JADX INFO: renamed from: O7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6139a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C6141c f20008Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f20009Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f20010o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Throwable f20011p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ LinkedHashMap f20012q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ HashSet f20013r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ String f20014s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ long f20015t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6139a(C6141c c6141c, int i10, String str, Throwable th2, LinkedHashMap linkedHashMap, HashSet hashSet, String str2, long j10) {
        super(2);
        this.f20008Y = c6141c;
        this.f20009Z = i10;
        this.f20010o0 = str;
        this.f20011p0 = th2;
        this.f20012q0 = linkedHashMap;
        this.f20013r0 = hashSet;
        this.f20014s0 = str2;
        this.f20015t0 = j10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C11682a datadogContext = (C11682a) obj;
        InterfaceC13576b eventBatchWriter = (InterfaceC13576b) obj2;
        AbstractC16544l.m18094g(datadogContext, "datadogContext");
        AbstractC16544l.m18094g(eventBatchWriter, "eventBatchWriter");
        String threadName = this.f20014s0;
        AbstractC16544l.m18093f(threadName, "threadName");
        C6141c c6141c = this.f20008Y;
        ((InterfaceC13575a) c6141c.f20026t0).mo12662a(eventBatchWriter, ((C15358g1) c6141c.f20024r0).m16582j(this.f20009Z, this.f20010o0, this.f20011p0, this.f20012q0, this.f20013r0, this.f20015t0, threadName, datadogContext, c6141c.f20019Y, (String) c6141c.f20023q0, c6141c.f20021o0, c6141c.f20022p0, (28672 & 4096) != 0 ? null : null, (28672 & 8192) != 0 ? null : null, C17689w.f56480Y), 1);
        return C17296C.f55119a;
    }
}
