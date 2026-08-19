package com.withpersona.sdk2.inquiry;

import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.os.Bundle;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p247Jj.C4399O;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0017"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/InlineInquiry;", "", "Lcom/withpersona/sdk2/inquiry/Inquiry;", ReferencesHeader.INQUIRY, "", "requestKey", "", "isNavBarEnabled", "controlNavigationBar", "controlStatusBar", "<init>", "(Lcom/withpersona/sdk2/inquiry/Inquiry;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Landroid/os/Bundle;", "bundle", "Lmm/C;", "addArgumentsToBundle", "(Landroid/os/Bundle;)V", "Landroidx/fragment/app/a;", "createFragment", "()Landroidx/fragment/app/a;", "Lcom/withpersona/sdk2/inquiry/Inquiry;", "Ljava/lang/String;", "Ljava/lang/Boolean;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class InlineInquiry {
    private final Boolean controlNavigationBar;
    private final Boolean controlStatusBar;
    private final Inquiry inquiry;
    private final Boolean isNavBarEnabled;
    private final String requestKey;

    public InlineInquiry(Inquiry inquiry, String str, Boolean bool, Boolean bool2, Boolean bool3) {
        AbstractC16544l.m18094g(inquiry, "inquiry");
        this.inquiry = inquiry;
        this.requestKey = str;
        this.isNavBarEnabled = bool;
        this.controlNavigationBar = bool2;
        this.controlStatusBar = bool3;
    }

    private final void addArgumentsToBundle(Bundle bundle) {
        String str = this.requestKey;
        if (str != null) {
            bundle.putString("REQUEST_KEY", str);
        }
        Boolean bool = this.isNavBarEnabled;
        if (bool != null) {
            bundle.putBoolean("IS_NAV_BAR_ENABLED", bool.booleanValue());
        }
        Boolean bool2 = this.controlNavigationBar;
        if (bool2 != null) {
            bundle.putBoolean("CONTROL_NAVIGATION_BAR", bool2.booleanValue());
        }
        Boolean bool3 = this.controlStatusBar;
        if (bool3 != null) {
            bundle.putBoolean("CONTROL_STATUS_BAR", bool3.booleanValue());
        }
    }

    public final AbstractComponentCallbacksC11000a createFragment() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a;
        try {
            Object objNewInstance = C4399O.class.getDeclaredConstructor(null).newInstance(null);
            abstractComponentCallbacksC11000a = objNewInstance instanceof AbstractComponentCallbacksC11000a ? (AbstractComponentCallbacksC11000a) objNewInstance : null;
        } catch (ClassNotFoundException unused) {
        }
        if (abstractComponentCallbacksC11000a == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        this.inquiry.addArgumentsToBundle$inquiry_dynamic_feature_release(bundle);
        addArgumentsToBundle(bundle);
        abstractComponentCallbacksC11000a.m11746P(bundle);
        return abstractComponentCallbacksC11000a;
    }
}
