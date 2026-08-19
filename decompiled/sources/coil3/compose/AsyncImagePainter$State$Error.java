package coil3.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p059C5.InterfaceC1589g;
import p374P5.C6350c;
import p882m1.AbstractC17140a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"coil3/compose/AsyncImagePainter$State$Error", "LC5/g;", "Lm1/a;", "painter", "Lm1/a;", "a", "()Lm1/a;", "coil-compose-core_release"}, m18068k = 1, m18069mv = {2, 0, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class AsyncImagePainter$State$Error implements InterfaceC1589g {

    /* JADX INFO: renamed from: a */
    public final C6350c f35916a;
    private final AbstractC17140a painter;

    public AsyncImagePainter$State$Error(AbstractC17140a abstractC17140a, C6350c c6350c) {
        this.painter = abstractC17140a;
        this.f35916a = c6350c;
    }

    /* JADX INFO: renamed from: b */
    public static AsyncImagePainter$State$Error m13136b(AsyncImagePainter$State$Error asyncImagePainter$State$Error, AbstractC17140a abstractC17140a) {
        C6350c c6350c = asyncImagePainter$State$Error.f35916a;
        asyncImagePainter$State$Error.getClass();
        return new AsyncImagePainter$State$Error(abstractC17140a, c6350c);
    }

    @Override // p059C5.InterfaceC1589g
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC17140a getPainter() {
        return this.painter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncImagePainter$State$Error)) {
            return false;
        }
        AsyncImagePainter$State$Error asyncImagePainter$State$Error = (AsyncImagePainter$State$Error) obj;
        return AbstractC16544l.m18089b(this.painter, asyncImagePainter$State$Error.painter) && AbstractC16544l.m18089b(this.f35916a, asyncImagePainter$State$Error.f35916a);
    }

    public final int hashCode() {
        AbstractC17140a abstractC17140a = this.painter;
        return this.f35916a.hashCode() + ((abstractC17140a == null ? 0 : abstractC17140a.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.painter + ", result=" + this.f35916a + ')';
    }
}
