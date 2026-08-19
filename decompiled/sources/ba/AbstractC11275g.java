package ba;

import p1009s9.C19501d;

/* JADX INFO: renamed from: ba.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11275g {

    /* JADX INFO: renamed from: a */
    public static final C19501d[] f34155a = {new C19501d(1, "name_ulr_private"), new C19501d(1, "name_sleep_segment_request"), new C19501d(1, "get_last_activity_feature_id"), new C19501d(1, "support_context_feature_id"), new C19501d(2, "get_current_location"), new C19501d(1, "get_last_location_with_request"), new C19501d(1, "set_mock_mode_with_callback"), new C19501d(1, "set_mock_location_with_callback"), new C19501d(1, "inject_location_with_callback"), new C19501d(1, "location_updates_with_callback"), new C19501d(1, "use_safe_parcelable_in_intents"), new C19501d(1, "flp_debug_updates"), new C19501d(1, "google_location_accuracy_enabled"), new C19501d(1, "geofences_with_callback"), new C19501d(1, "location_enabled")};

    /* JADX INFO: renamed from: a */
    public static String m12681a(int i10) {
        if (i10 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i10 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i10 == 104) {
            return "LOW_POWER";
        }
        if (i10 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
