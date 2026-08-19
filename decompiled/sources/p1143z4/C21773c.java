package p1143z4;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1091wn.AbstractC21031l;

/* JADX INFO: renamed from: z4.c */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC21768J("activity")
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18067d2 = {"Lz4/c;", "Lz4/K;", "Lz4/a;", "navigation-runtime_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public class C21773c extends AbstractC21769K {

    /* JADX INFO: renamed from: c */
    public final Activity f69064c;

    public C21773c(Context context) {
        AbstractC16544l.m18094g(context, "context");
        for (Object obj : AbstractC21031l.m21492p(C21772b.f69055Z, context)) {
            if (((Context) obj) instanceof Activity) {
                this.f69064c = (Activity) obj;
            }
        }
        obj = null;
        this.f69064c = (Activity) obj;
    }

    @Override // p1143z4.AbstractC21769K
    /* JADX INFO: renamed from: a */
    public final AbstractC21790t mo986a() {
        return new C21771a(this);
    }

    @Override // p1143z4.AbstractC21769K
    /* JADX INFO: renamed from: c */
    public final AbstractC21790t mo22259c(AbstractC21790t abstractC21790t) {
        throw new IllegalStateException(AbstractC10763a.m11056n(new StringBuilder("Destination "), ((C21771a) abstractC21790t).f69135r0, " does not have an Intent set.").toString());
    }

    @Override // p1143z4.AbstractC21769K
    /* JADX INFO: renamed from: f */
    public final boolean mo22260f() {
        Activity activity = this.f69064c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
