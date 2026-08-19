package p520V5;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC16544l;
import p594Y9.C9895g4;
import p658b5.C11233d;

/* JADX INFO: renamed from: V5.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC7776e implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24559a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f24560b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f24561c;

    public /* synthetic */ CallableC7776e(Object obj, int i10, int i11) {
        this.f24559a = i11;
        this.f24561c = obj;
        this.f24560b = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f24559a) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f24561c;
                boolean z6 = lottieAnimationView.f35928A0;
                int i10 = this.f24560b;
                if (!z6) {
                    return AbstractC7785n.m8047e(i10, lottieAnimationView.getContext(), null);
                }
                Context context = lottieAnimationView.getContext();
                return AbstractC7785n.m8047e(i10, context, AbstractC7785n.m8052j(context, i10));
            default:
                C9895g4 this$0 = (C9895g4) this.f24561c;
                AbstractC16544l.m18094g(this$0, "this$0");
                WorkDatabase workDatabase = (WorkDatabase) this$0.f29409Y;
                Long lM12497A = workDatabase.mo12349l().m12497A("next_job_scheduler_id");
                int i11 = 0;
                int iLongValue = lM12497A != null ? (int) lM12497A.longValue() : 0;
                workDatabase.mo12349l().m12499C(new C11233d("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                if (iLongValue < 0 || iLongValue > this.f24560b) {
                    workDatabase.mo12349l().m12499C(new C11233d("next_job_scheduler_id", Long.valueOf(1)));
                } else {
                    i11 = iLongValue;
                }
                return Integer.valueOf(i11);
        }
    }
}
