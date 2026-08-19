package p539W4;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import p444S4.C7011q;
import p444S4.C7012r;

/* JADX INFO: renamed from: W4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8425a {

    /* JADX INFO: renamed from: c */
    public static final String f26240c = C7011q.m7409f("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a */
    public final ComponentName f26241a;

    /* JADX INFO: renamed from: b */
    public final C7012r f26242b;

    public C8425a(Context context, C7012r c7012r) {
        this.f26242b = c7012r;
        this.f26241a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
