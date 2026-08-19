package com.openai.voice.assistant;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p003A1.C0181K0;
import p196Hi.C3432b;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC8104h6;
import p537W0.C8410b;
import p553Wh.C8870f;
import p571X9.AbstractC9209T;
import p795i.AbstractC14890d;
import p893n.AbstractActivityC17375g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/voice/assistant/AssistantActivity;", "Ln/g;", "<init>", "()V", "voice_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AssistantActivity extends AbstractActivityC17375g {
    /* JADX INFO: renamed from: s */
    public static final void m14401s(AssistantActivity assistantActivity, C8870f c8870f) {
        Intent launchIntentForPackage = assistantActivity.getPackageManager().getLaunchIntentForPackage(assistantActivity.getPackageName());
        Intent intentMakeMainActivity = Intent.makeMainActivity(launchIntentForPackage != null ? launchIntentForPackage.getComponent() : null);
        AbstractC16544l.m18093f(intentMakeMainActivity, "makeMainActivity(...)");
        AbstractC9209T.m9776b(assistantActivity, c8870f, intentMakeMainActivity);
        assistantActivity.finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC11001b, androidx.activity.AbstractActivityC10817a, p896n2.AbstractActivityC17454g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().clearFlags(67108864);
        getWindow().setStatusBarColor(0);
        C8410b c8410b = new C8410b(new C3432b(this, 1), true, 539159711);
        ViewGroup.LayoutParams layoutParams = AbstractC14890d.f46379a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        C0181K0 c0181k0 = childAt instanceof C0181K0 ? (C0181K0) childAt : null;
        if (c0181k0 != null) {
            c0181k0.setParentCompositionContext(null);
            c0181k0.setContent(c8410b);
            return;
        }
        C0181K0 c0181k1 = new C0181K0(this);
        c0181k1.setParentCompositionContext(null);
        c0181k1.setContent(c8410b);
        View decorView = getWindow().getDecorView();
        if (AbstractC7841A0.m8090b(decorView) == null) {
            AbstractC7841A0.m8092d(decorView, this);
        }
        if (ViewTreeViewModelStoreOwner.m12147a(decorView) == null) {
            ViewTreeViewModelStoreOwner.m12148b(decorView, this);
        }
        if (AbstractC8104h6.m8583b(decorView) == null) {
            AbstractC8104h6.m8585d(decorView, this);
        }
        setContentView(c0181k1, AbstractC14890d.f46379a);
    }
}
