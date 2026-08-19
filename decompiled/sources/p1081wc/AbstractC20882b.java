package p1081wc;

import androidx.fragment.app.OwC.wNrQXvwLiB;

/* JADX INFO: renamed from: wc.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20882b extends AbstractC20892k {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f66501b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC20882b(String str, int i10) {
        super(str);
        this.f66501b = i10;
    }

    @Override // p1081wc.AbstractC20892k
    public String toString() {
        switch (this.f66501b) {
            case 29:
                return "voice_limit_" + this.f66564a;
            default:
                return super.toString();
        }
    }

    @Override // p1081wc.AbstractC20892k
    /* JADX INFO: renamed from: a */
    public final String mo21446a() {
        switch (this.f66501b) {
            case 0:
                return "Account Disclosure";
            case 1:
                return "Account";
            case 2:
                return "App";
            case 3:
                return "AppReport";
            case 4:
                return "Auth";
            case 5:
                return "Browsing";
            case 6:
                return "Compliance";
            case 7:
                return "Dalle";
            case 8:
                return "Gizmos";
            case 9:
                return "MessageAudio";
            case 10:
                return "MessagePopupMenu";
            case 11:
                return "Model Switcher";
            case 12:
                return "Navigation";
            case 13:
                return "Notification";
            case 14:
                return "OverflowMenu";
            case 15:
                return "Rate Limit";
            case 16:
                return "Search";
            case 17:
                return "Settings";
            case 18:
                return "Share Receiver";
            case 19:
                return wNrQXvwLiB.UWKlzqluADDsDIX;
            case 20:
                return "Thread";
            case 21:
                return "Vision";
            case 22:
                return "Voice";
            case 23:
                return "Widget";
            case 24:
                return "Canmore";
            case 25:
                return "Interstitial";
            case 26:
                return "Jawbone Tool";
            case 27:
                return "Native Onboarding";
            case 28:
                return "Notification Settings";
            default:
                return "voice_limit";
        }
    }
}
