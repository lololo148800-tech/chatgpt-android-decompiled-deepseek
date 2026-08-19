package p624Zg;

import android.content.Context;
import com.openai.chatgpt.R;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Zg.w */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10391w {

    /* JADX INFO: renamed from: a */
    public static final List f30799a = AbstractC17681o.m19382k(Integer.valueOf(R.string.subscriptions_pro_title_one), Integer.valueOf(R.string.subscriptions_pro_title_two), Integer.valueOf(R.string.subscriptions_pro_title_three), Integer.valueOf(R.string.subscriptions_pro_title_four), Integer.valueOf(R.string.subscriptions_pro_title_five));

    /* JADX INFO: renamed from: b */
    public static final List f30800b = AbstractC17681o.m19382k(Integer.valueOf(R.string.subscriptions_premium_title_one), Integer.valueOf(R.string.subscriptions_premium_title_two), Integer.valueOf(R.string.subscriptions_premium_title_three), Integer.valueOf(R.string.subscriptions_premium_title_four), Integer.valueOf(R.string.subscriptions_premium_title_five), Integer.valueOf(R.string.subscriptions_premium_title_six), Integer.valueOf(R.string.subscriptions_premium_title_seven));

    /* JADX INFO: renamed from: a */
    public static final String m10894a(Context context, C10337G purchasePackage, boolean z6) {
        int i10;
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(purchasePackage, "purchasePackage");
        int iOrdinal = purchasePackage.f30671c.ordinal();
        if (iOrdinal == 0) {
            i10 = R.string.subscriptions_amount_per_lifetime;
        } else if (iOrdinal == 1) {
            i10 = R.string.subscriptions_amount_per_year;
        } else if (iOrdinal == 2) {
            i10 = (z6 && purchasePackage.f30670b) ? R.string.subscriptions_amount_per_month_with_one_week_free_trial : R.string.subscriptions_amount_per_month;
        } else {
            if (iOrdinal != 3) {
                throw new C0644w();
            }
            i10 = R.string.subscriptions_amount_per_week;
        }
        String string = context.getString(i10, purchasePackage.f30672d);
        AbstractC16544l.m18093f(string, "getString(...)");
        return string;
    }
}
