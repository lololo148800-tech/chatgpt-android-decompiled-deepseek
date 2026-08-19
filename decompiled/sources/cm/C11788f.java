package cm;

import am.C10752f;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import io.sentry.android.core.AbstractC15256t;
import p140Fa.C2685e;

/* JADX INFO: renamed from: cm.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C11788f extends URLSpan {

    /* JADX INFO: renamed from: Y */
    public final C10752f f35745Y;

    /* JADX INFO: renamed from: Z */
    public final String f35746Z;

    /* JADX INFO: renamed from: o0 */
    public final C2685e f35747o0;

    public C11788f(C10752f c10752f, String str, C2685e c2685e) {
        super(str);
        this.f35745Y = c10752f;
        this.f35746Z = str;
        this.f35747o0 = c2685e;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f35747o0.getClass();
        String str = this.f35746Z;
        Uri uriBuild = Uri.parse(str);
        if (TextUtils.isEmpty(uriBuild.getScheme())) {
            uriBuild = uriBuild.buildUpon().scheme("https").build();
        }
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", uriBuild);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            AbstractC15256t.m16482t("LinkResolverDef", "Actvity was not found for the link: '" + str + Separators.QUOTE);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f35745Y.getClass();
        textPaint.setUnderlineText(true);
        textPaint.setColor(textPaint.linkColor);
    }
}
