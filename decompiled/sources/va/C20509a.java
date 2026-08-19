package va;

import android.content.Context;
import com.openai.chatgpt.R;
import p523V9.AbstractC7972Q3;
import p523V9.AbstractC8070d4;

/* JADX INFO: renamed from: va.a */
/* JADX INFO: loaded from: classes.dex */
public final class C20509a {

    /* JADX INFO: renamed from: f */
    public static final int f65114f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a */
    public final boolean f65115a;

    /* JADX INFO: renamed from: b */
    public final int f65116b;

    /* JADX INFO: renamed from: c */
    public final int f65117c;

    /* JADX INFO: renamed from: d */
    public final int f65118d;

    /* JADX INFO: renamed from: e */
    public final float f65119e;

    public C20509a(Context context) {
        boolean zM8264e = AbstractC7972Q3.m8264e(context, R.attr.elevationOverlayEnabled, false);
        int iM8477d = AbstractC8070d4.m8477d(context, R.attr.elevationOverlayColor, 0);
        int iM8477d2 = AbstractC8070d4.m8477d(context, R.attr.elevationOverlayAccentColor, 0);
        int iM8477d3 = AbstractC8070d4.m8477d(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f65115a = zM8264e;
        this.f65116b = iM8477d;
        this.f65117c = iM8477d2;
        this.f65118d = iM8477d3;
        this.f65119e = f10;
    }
}
