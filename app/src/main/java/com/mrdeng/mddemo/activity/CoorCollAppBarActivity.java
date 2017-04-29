package com.mrdeng.mddemo.activity;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;

import com.mrdeng.mddemo.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 这种效果在详情页面用的较多，展示个性化内容，图像有强烈的吸引力。这个效果重点使用了CollapsingToolbarLayout 。
 * CollapsingToolbarLayout可实现Toolbar的折叠效果。CollapsingToolbarLayout的子视图类似与LinearLayout垂直方向排放。
 * <p>
 * CollapsingToolbarLayout 提供以下属性和方法是用：
 * </p>
 * <pre>
 * 1. Collapsing title：ToolBar的标题，当CollapsingToolbarLayout全屏没有折叠时，title显示的是大字体，在折叠的过程中，title不断变小到一定大小的效果。你可以调用setTitle(CharSequence)方法设置title。
 * 2. Content scrim：ToolBar被折叠到顶部固定时候的背景，你可以调用setContentScrim(Drawable)方法改变背景或者 在属性中使用 app:contentScrim=”?attr/colorPrimary”来改变背景。
 * 3. Status bar scrim：状态栏的背景，调用方法setStatusBarScrim(Drawable)。还没研究明白，不过这个只能在Android5.0以上系统有效果。
 * 4. Parallax scrolling children：CollapsingToolbarLayout滑动时，子视图的视觉差，可以通过属性app:layout_collapseParallaxMultiplier=”0.6”改变。值de的范围[0.0,1.0]，值越大视察越大。
 * 5. CollapseMode ：子视图的折叠模式，在子视图设置，有两种“pin”：固定模式，在折叠的时候最后固定在顶端；“parallax”：视差模式，在折叠的时候会有个视差折叠的效果。我们可以在布局中使用属性app:layout_collapseMode=”parallax”来改变。
 * </pre>
 * <p>
 * CoordinatorLayout 还提供了一个 layout_anchor 的属性，连同 layout_anchorGravity 一起，可以用来放置与其他视图关联在一起的悬浮视图（如 FloatingActionButton）。本例中使用FloatingActionButton。
 * </p>
 * 通过下面的参数设置了FloatingActionButton的位置，两个属性共同作用使得FAB 浮动按钮也能折叠消失，展现。
 * <pre>
 * app:layout_anchor="@id/appbar"
 * app:layout_anchorGravity="bottom|right|end"
 * </pre>
 * <p>
 * 使用CollapsingToolbarLayout实现折叠效果，需要注意3点
 * </p>
 * <p>
 * <pre>
 * 1. AppBarLayout的高度固定
 * 2. CollapsingToolbarLayout的子视图设置layout_collapseMode属性
 * 3. 关联悬浮视图设置app:layout_anchor，app:layout_anchorGravity属性
 * </pre>
 */
public class CoorCollAppBarActivity extends AppCompatActivity {

    @Bind(R.id.iv_bg)
    ImageView mIvBg;
    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.coll)
    CollapsingToolbarLayout mColl;
    @Bind(R.id.appbar)
    AppBarLayout mAppbar;
    @Bind(R.id.activity_coor_coll_app_bar)
    CoordinatorLayout mActivityCoorCollAppBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coor_coll_app_bar);
        ButterKnife.bind(this);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Coor_Coll_Appbar");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
