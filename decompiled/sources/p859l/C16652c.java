package p859l;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: l.c */
/* JADX INFO: loaded from: classes.dex */
public final class C16652c extends AbstractC16651b {

    /* JADX INFO: renamed from: a */
    public final String f53352a;

    public C16652c(String str) {
        this.f53352a = str;
    }

    @Override // p859l.AbstractC16651b
    public final Intent createIntent(Context context, Object obj) {
        String input = (String) obj;
        AbstractC16544l.m18094g(input, "input");
        Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f53352a).putExtra("android.intent.extra.TITLE", input);
        AbstractC16544l.m18093f(intentPutExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
        return intentPutExtra;
    }

    @Override // p859l.AbstractC16651b
    public final C16650a getSynchronousResult(Context context, Object obj) {
        String input = (String) obj;
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(input, "input");
        return null;
    }

    @Override // p859l.AbstractC16651b
    public final Object parseResult(int i10, Intent intent) {
        if (i10 != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
