package p832jb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: jb.f */
/* JADX INFO: loaded from: classes.dex */
public final class C16186f extends BroadcastReceiver {

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f50231b = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public final Context f50232a;

    public C16186f(Context context) {
        this.f50232a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("fwf6EpFSjwNHhVvx", new Object[]{this, context, intent});
    }
}
