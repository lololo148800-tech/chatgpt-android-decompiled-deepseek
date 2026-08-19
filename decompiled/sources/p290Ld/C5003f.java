package p290Ld;

import io.sentry.internal.debugmeta.C15384c;
import kotlin.jvm.internal.AbstractC16544l;
import p402Qc.C6589e;
import p593Y8.C9683j;
import p658b5.C11232c;
import p763g5.AbstractC13819d;
import p763g5.InterfaceC13817b;

/* JADX INFO: renamed from: Ld.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C5003f extends AbstractC13819d implements InterfaceC13817b {

    /* JADX INFO: renamed from: o0 */
    public final C6589e f16320o0;

    /* JADX INFO: renamed from: p0 */
    public final C6589e f16321p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5003f(C9683j c9683j, C11232c DBConversationAdapter, C15384c DBMessageAdapter) {
        super(c9683j);
        AbstractC16544l.m18094g(DBConversationAdapter, "DBConversationAdapter");
        AbstractC16544l.m18094g(DBMessageAdapter, "DBMessageAdapter");
        this.f16320o0 = new C6589e(c9683j, DBConversationAdapter);
        this.f16321p0 = new C6589e(c9683j, DBMessageAdapter);
    }
}
