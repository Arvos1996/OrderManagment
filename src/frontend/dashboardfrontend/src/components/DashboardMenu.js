import {Breadcrumb, Layout, Menu} from 'antd';
import {
    DesktopOutlined, FileOutlined, PieChartOutlined, TeamOutlined,
    UserOutlined,
} from '@ant-design/icons';
import {Component} from "react";
import {Link} from "react-router-dom";
import DataTable from "./ContactView";
import {Route, Switch} from "react-router";

const {Header, Content, Footer, Sider} = Layout;
const {SubMenu} = Menu;

class DashboardMenu extends Component {
    state = {
        collapsed: false,
    };

    onCollapse = collapsed => {
        console.log(collapsed);
        this.setState({collapsed});
    };

    render() {
        const {collapsed} = this.state;
        return (
            <Layout style={{ minHeight: '100vh' }}>
                <Sider collapsible collapsed={collapsed} onCollapse={this.onCollapse}>
                    <div className="logo" />
                    <Menu theme="dark" defaultSelectedKeys={['1']} mode="inline">
                        <Menu.Item key="1" icon={<PieChartOutlined />}>
                            <Link to= "/demo" > Option 1 </Link>
                        </Menu.Item>
                        <Menu.Item key="2" icon={<DesktopOutlined />}>
                            <Link to= "/contacts" > Option 2 </Link>
                        </Menu.Item>
                        <SubMenu key="sub1" icon={<UserOutlined />} title="User">
                            <Menu.Item key="3">Tom</Menu.Item>
                            <Menu.Item key="4">Bill</Menu.Item>
                            <Menu.Item key="5">Alex</Menu.Item>
                        </SubMenu>
                        <SubMenu key="sub2" icon={<TeamOutlined />} title="Team">
                            <Menu.Item key="6">Team 1</Menu.Item>
                            <Menu.Item key="8">Team 2</Menu.Item>
                        </SubMenu>
                        <Menu.Item key="9" icon={<FileOutlined />}>
                            Files
                        </Menu.Item>
                    </Menu>
                </Sider>
                <Layout className="site-layout">
                    <Header className="site-layout-background" style={{ padding: 0 }} />
                    <Content style={{ margin: '0 16px' }}>
                        <Switch>
                            <Route path = "/contacts">
                                <Breadcrumb style={{ margin: '16px 0' }}>
                                    <Breadcrumb.Item>Contacts</Breadcrumb.Item>
                                </Breadcrumb>
                                <DataTable/>
                            </Route>
                            <Route path = "/demo">
                                <Breadcrumb style={{ margin: '16px 0' }}>
                                    <Breadcrumb.Item>User</Breadcrumb.Item>
                                    <Breadcrumb.Item>Bill</Breadcrumb.Item>
                                </Breadcrumb>
                                <p>Test</p>
                            </Route>
                        </Switch>
                    </Content>
                    <Footer style={{ textAlign: 'center' }}>Ant Design ©2018 Created by Ant UED</Footer>
                </Layout>
            </Layout>
        );
    }
}

export default DashboardMenu;